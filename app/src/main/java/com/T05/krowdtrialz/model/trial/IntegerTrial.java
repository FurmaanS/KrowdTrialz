package com.T05.krowdtrialz.model.trial;

import android.location.Location;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.T05.krowdtrialz.model.user.User;

import java.time.LocalDate;

/**
 * IntegerTrials hold a single value which is the
 * output of the trial. The integer value could represent
 * something like "number of laps completed in 10 min." for
 * instance.
 * */
public class IntegerTrial extends Trial {
    private Integer value;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public IntegerTrial(User user, Location location) {
        super(user, location);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public IntegerTrial(User user, Location location, LocalDate dateCreated) {
        super(user, location, dateCreated);
    }

    public Integer getValue() {
        return value;
    }
}
