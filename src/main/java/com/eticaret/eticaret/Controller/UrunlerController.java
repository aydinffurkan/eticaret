package com.eticaret.eticaret.Controller;

import com.eticaret.eticaret.Model.Tedarikci;
import com.eticaret.eticaret.Model.Urunler;
import com.eticaret.eticaret.Repository.IUrunlerRepository;
import com.eticaret.eticaret.Service.UrunlerService;
import com.eticaret.eticaret.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/urunler")
public class UrunlerController {

    @Autowired
    private UrunlerService urunlerService;

    @GetMapping("/getUrunler")
    public List<Urunler> getUrunler() {
        return urunlerService.getUrunler();
    }

    @GetMapping("/getUrunlerById/{id}")
    public ResponseEntity < Urunler > getInstructorById(
            @PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        Urunler user = urunlerService.getUrunlerById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Belirletilen İd Numarasına Ait Kayıt Bulunamadı.. :: " + id));
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/addUrunler")
    public Urunler createUrunler(@RequestBody Urunler urunler) {
        return urunlerService.saveUrunler(urunler);
    }

    @DeleteMapping("/deleteUrunler/{id}")
    public Map<String, Boolean> deleteUrunler(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {

        Urunler employee = urunlerService.getUrunlerById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bu id'de ürün bulunmamaktadır. :: " + id));

        urunlerService.deleteUrunler(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;

    }

    @GetMapping("/kategori/{id}")
    public List<Urunler> findBooksByAuthorNameAndTitle(@PathVariable(value = "id") Long kategori_id) {
        return urunlerService.findBooksByAuthorNameAndTitle(kategori_id);

    }

    //Database'deki veriyi güncelleyen metot
    @PutMapping("/guncellemeUrunler/{id}")
    public ResponseEntity<Urunler> updateEmployee(@PathVariable(value = "id") Long urunId,
                                                  @RequestBody Urunler employeeDetails) throws ResourceNotFoundException {
        Urunler employee = urunlerService.getUrunlerById(urunId)
                .orElseThrow(() -> new ResourceNotFoundException("Bu id'de ürün bulunmamaktadır. :: " + urunId));


        employee.setUrunAdi(employeeDetails.getUrunAdi());
        employee.setStok(employeeDetails.getStok());

        final Urunler updatedEmployee = urunlerService.saveUrunler(employee);

        return ResponseEntity.ok(updatedEmployee);
    }

//
//    @PatchMapping("/users/{id}")
//    public ResponseEntity<Urunler> updateUserPartially(
//            @PathVariable(value = "id") Long userId,
//             @RequestBody Urunler userDetails) throws ResourceNotFoundException {
//        Urunler user = urunlerService.getUrunlerById(userId)
//                .orElseThrow(() -> new ResourceNotFoundException("User not found on :: "+ userId));
//
//        user.setUrunAdi(userDetails.getUrunAdi());
//
//        final Urunler updatedUser = urunlerService.saveUrunler(user);
//        return ResponseEntity.ok(updatedUser);
//    }


}
