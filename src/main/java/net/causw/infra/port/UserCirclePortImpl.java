package net.causw.adapter.persistence.port;

import net.causw.application.dto.UserCircleDto;
import net.causw.application.spi.UserCirclePort;
import net.causw.domain.exceptions.BadRequestException;
import net.causw.domain.exceptions.ErrorCode;
import net.causw.adapter.persistence.UserCircleRepository;

public class UserCirclePortImpl implements UserCirclePort {
    private final UserCircleRepository userCircleRepository;

    public UserCirclePortImpl(UserCircleRepository userCircleRepository) { this.userCircleRepository = userCircleRepository; }

    @Override
    public UserCircleDto findById(String id){
        return UserCircleDto.from(this.userCircleRepository.findById(id).orElseThrow(
                () -> new BadRequestException(
                        ErrorCode.ROW_DOES_NOT_EXIST,
                        "Invalid user circle id"
                )
        ));
    }
}
