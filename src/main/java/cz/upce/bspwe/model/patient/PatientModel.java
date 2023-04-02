package cz.upce.bspwe.model.patient;

import cz.upce.bspwe.db.entity.Patient;
import cz.upce.bspwe.model.UserModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PatientModel extends UserModel {

    public PatientModel(Patient entity) {
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.email = entity.getEmail();
        this.phoneNumber = entity.getPhoneNumber();
    }
}
