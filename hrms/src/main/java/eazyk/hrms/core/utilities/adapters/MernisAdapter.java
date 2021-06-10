package eazyk.hrms.core.utilities.adapters;

import eazyk.hrms.business.abstracts.CheckService;
import eazyk.hrms.entitites.abstracts.User;
import eazyk.hrms.services.mernis.VFCKPSPublicSoap;
import org.springframework.stereotype.Service;

@Service
public class MernisAdapter implements CheckService {

    @Override
    public boolean isChecked(Long identificationNumber, String firstName, String lastName, int birthYear) throws Exception {
        VFCKPSPublicSoap vfckpsPublicSoap = new VFCKPSPublicSoap();
        return vfckpsPublicSoap.TCKimlikNoDogrula(identificationNumber, firstName, lastName, birthYear);

    }
}
