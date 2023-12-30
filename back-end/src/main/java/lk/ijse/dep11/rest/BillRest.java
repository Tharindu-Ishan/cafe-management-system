package lk.ijse.dep11.rest;

import lk.ijse.dep11.POJO.Bill;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping("/bill")
public interface BillRest {
    @PostMapping("/generateReport")
    ResponseEntity<String> generateReport(@RequestBody Map<String,Object> requestMap);
    @GetMapping("/getBills")
    ResponseEntity<List<Bill>> getBills();
}
