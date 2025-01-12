package org.mifos.mobilewallet.core.data.fineract.entity.mapper;

import com.mifos.mobilewallet.model.entity.UserEntity;
import com.mifos.mobilewallet.model.domain.user.User;

import javax.inject.Inject;

/**
 * Created by naman on 17/6/17.
 */

public class UserEntityMapper {

    @Inject
    public UserEntityMapper() {
    }

    public User transform(UserEntity userEntity) {
        User user = new User();

        if (userEntity != null) {
            user.setUserId(userEntity.getUserId());
            user.setUserName(userEntity.getUserName());
            user.setAuthenticationKey(userEntity.getBase64EncodedAuthenticationKey());

        }
        return user;
    }
}
