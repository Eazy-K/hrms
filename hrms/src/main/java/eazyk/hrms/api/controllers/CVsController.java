package eazyk.hrms.api.controllers;



import eazyk.hrms.business.abstracts.CVService;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.Result;
import eazyk.hrms.entitites.dtos.requests.CVAddRequest;
import eazyk.hrms.entitites.dtos.responses.CVResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/cv")
public class CVsController {

    private final CVService cvService;

    @PostMapping("/saveCV")
    public Result saveCV(@RequestBody CVAddRequest cvAddRequest) {
      return this.cvService.saveCV(cvAddRequest);
    }

    @GetMapping("/getCvList")
    public DataResult<List<CVResponse>> getAll() {
        return this.cvService.getAllCVs();
    }

    @PutMapping("/saveImage")
    public Result saveImage(@RequestBody MultipartFile multipartFile, @RequestParam int cvId) {
        return this.cvService.saveImage(multipartFile, cvId);
    }



}
