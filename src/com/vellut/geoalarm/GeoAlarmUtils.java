package com.vellut.geoalarm;

public class GeoAlarmUtils {
	public static final String APPTAG = "GeoAlarm";
	
	public static final String GEOFENCE_REQUEST_ID = "GeoAlarm";
	
	public static final String ACTION_STOP_ALARM = "StopAlarm";
	
	public static final int GEOFENCE_NOTIFICATION_ID = 1;
	
	public static final String EXTRA_USE_VIBRATE = "UseVibrate";
	public static final String EXTRA_RINGTONE_URI = "RingtoneUri";
	public static final String EXTRA_ALARM_SET_TIME = "AlarmSetTime";
	
	public static final long MIN_DTIME = 5000;
	
	public final static int RINGTONE_PICKER_REQUEST_CODE = 1;
	public final static int CONNECTION_FAILURE_RESOLUTION_REQUEST = 2;
	
	public final static String PREFERENCES_FILE_NAME = "com.vellut.geoalarm.Preferences";
	public final static String PREF_IS_FIRST_TIME_RUN = "isFirstTimeRun";
	public final static String PREF_RINGTONE_URI = "ringtoneUri";
	public final static String PREF_NORTH_LAT = "northLat";
	public final static String PREF_WEST_LON = "westLon";
	public final static String PREF_SOUTH_LAT = "southLat";
	public final static String PREF_EAST_LON = "eastLon";
	public final static String PREF_USE_VIBRATE = "useVibrate";
	public final static String PREF_IS_ALARM_ON = "isAlarmOn";

    
}
