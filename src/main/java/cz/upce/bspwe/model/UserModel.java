package cz.upce.bspwe.model;

import lombok.Data;

@Data
public abstract class UserModel {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
}
