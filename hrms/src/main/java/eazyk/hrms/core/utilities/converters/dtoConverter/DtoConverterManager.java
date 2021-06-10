package eazyk.hrms.core.utilities.converters.dtoConverter;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DtoConverterManager implements DtoConverterService{

    private final ModelMapper modelMapper;

    @Override
    public <S, T> List<T> dtoConverter(List<S> source,  Class<T> targetClass) {
        return source.stream().map(item -> modelMapper.map(item, targetClass)).collect(Collectors.toList());
    }

    @Override
    public <T> Object dtoClassConverter(Object source, Class<T> baseClass) {
        return modelMapper.map(source, baseClass);
    }
}
