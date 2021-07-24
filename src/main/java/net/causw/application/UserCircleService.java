package net.causw.application;

import net.causw.application.dto.UserCircleDto;
import net.causw.application.spi.UserCirclePort;
import org.springframework.stereotype.Service;

@Service
public class UserCircleService {
    private final UserCirclePort userCirclePort;

    public UserCircleService(UserCirclePort userCirclePort) { this.userCirclePort = userCirclePort; }

    public UserCircleDto findById(String id){ return this.userCirclePort.findById(id); }
}
