package net.causw.adapter.persistence;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.EnumType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "TB_USERCIRCLE")
public class UserCircle extends BaseEntity{
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private UserCircleStatus status;

    @ManyToOne
    @JoinColumn(name = "circle_id")
    private Circle circle;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private UserCircle(
            UserCircleStatus status
    ){
        this.status = status;
    }

    public static UserCircle of(
        UserCircleStatus status
    ){
        return new UserCircle(
                status
        );
    }
}
