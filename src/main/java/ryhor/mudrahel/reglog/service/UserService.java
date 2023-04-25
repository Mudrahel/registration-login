package ryhor.mudrahel.reglog.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ryhor.mudrahel.reglog.model.User;
import ryhor.mudrahel.reglog.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
