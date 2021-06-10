package eazyk.hrms.core.utilities.cloudinary;

import java.io.IOException;
import java.util.Map;


import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import eazyk.hrms.core.utilities.result.DataResult;
import eazyk.hrms.core.utilities.result.ErrorDataResult;
import eazyk.hrms.core.utilities.result.SuccessDataResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class CloudinaryManager implements CloudinaryService{

    private final Cloudinary cloudinary;

    @SuppressWarnings("rawtypes")
    @Override
    public DataResult<?> save(MultipartFile multipartFile) {
        try {
            Map cloudinaryUploader = cloudinary.uploader().upload(multipartFile.getBytes(), ObjectUtils.emptyMap());
            return new SuccessDataResult<Map>(cloudinaryUploader);
        } catch (IOException e) {

        }
        return new ErrorDataResult<Map>();
    }
}
