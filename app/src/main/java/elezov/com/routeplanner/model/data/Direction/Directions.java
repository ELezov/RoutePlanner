package elezov.com.routeplanner.model.data.Direction;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by USER on 19.02.2017.
 */

public class Directions {
    @SerializedName("routes")
    private List<Route> routes;

    public List<Route> getRoutes() {
        return routes;
    }
}

