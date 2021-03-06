package polar.com.sdk.api.model;

import java.util.List;

public class PolarMagnetometerData {

    public static class PolarMagnetometerDataSample {
        /**
         * x axis in Gauss
         */
        public final float x;
        /**
         * y axis in Gauss
         */
        public final float y;
        /**
         * z axis in Gauss
         */
        public final float z;

        public PolarMagnetometerDataSample(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    /**
     * Acceleration samples list. Each sample contains signed x,y,z axis value in Gauss
     */
    public final List<PolarMagnetometerDataSample> samples;

    /**
     * Last sample timestamp in nanoseconds
     */
    public final long timeStamp;

    /**
     * Constructor
     *
     * @param samples   magnetometer samples
     * @param timeStamp in nanoseconds
     */
    public PolarMagnetometerData(List<PolarMagnetometerDataSample> samples, long timeStamp) {
        this.samples = samples;
        this.timeStamp = timeStamp;
    }
}
