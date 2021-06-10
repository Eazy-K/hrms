package eazyk.hrms.core.utilities.cloudinary;

import eazyk.hrms.core.utilities.result.DataResult;
import org.springframework.web.multipart.MultipartFile;

public interface CloudinaryService {

    DataResult<?> save(MultipartFile multipartFile);
}
