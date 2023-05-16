package Location.SafeLoc;
import Location.Location;

public abstract class SafeLoc extends Location{

    public SafeLoc(String name) {
        super(name);

    }

    public abstract boolean onLocation();
}

