package elezov.com.routeplanner.model.data.Direction;

import com.google.gson.annotations.SerializedName;

/**
 * Created by USER on 19.02.2017.
 */

public class OverviewPolyLine {
    @SerializedName("points")
    public String points;

    public String getPoints() {
        return points;
    }
}
