package net.causw.application.spi;

import net.causw.application.dto.UserCircleDto;

public interface UserCirclePort {
    UserCircleDto findById(String id);
}
