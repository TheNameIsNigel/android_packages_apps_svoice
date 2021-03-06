package com.vlingo.core.internal.settings.util;

public class CoreSettings
{
  public static final String ALERT_TONES = "behavior.alert_tones";
  public static final String ALERT_TONES_HIGH = "behavior.alert_tones.high";
  public static final String ALERT_TONES_LOW = "behavior.alert_tones.low";
  public static final String ALERT_TONES_MEDIUM = "behavior.alert_tones.medium";
  public static final String ALERT_TONES_OFF = "behavior.alert_tones.off";
  public static final String ALERT_TONES_VIBRATE = "behavior.alert_tones.vibrate";
  public static final String ASR_KEEPALIVE = "pref.internal.asr_keepalive";
  public static final String AUTO_ENDPOINT_TIMELIMIT_WITHOUT_SPEECH_SEC = "behavior.auto_endpointing.timelimit.withoutspeech";
  public static final String AUTO_ENDPOINT_TIMELIMIT_WITHOUT_SPEECH_SEC_CAR = "behavior.auto_endpointing.timelimit.withoutspeechcar";
  public static final String AUTO_ENDPOINT_TIMELIMIT_WITH_SPEECH_SEC = "behavior.auto_endpointing.timelimit.withspeech";
  public static final String AUTO_ENDPOINT_TIMELIMIT_WITH_SPEECH_SEC_CAR = "behavior.auto_endpointing.timelimit.withspeechcar";
  public static final String AUTO_PUNCTUATION = "pref.autopunctuation";
  public static final String BLUETOOTH_VIBRATE_TIMING = "behavior.bluetooth.vibrate.timing";
  public static final String BROWSER_FORCE_BIS = "browser.force_bis";
  public static final String CONNECTION_TYPE = "network.connection_type";
  public static final String CONNECTION_TYPE_BIS = "network.connection_type.bis";
  public static final String CONNECTION_TYPE_DIRECT_TCP = "network.connection_type.directtcp";
  public static final String CONNECTION_TYPE_MDS = "network.connection_type.mds";
  public static final String DETAILED_TIMINGS = "pref.internal.detailed_timings";
  public static final String LANGUAGE = "pref.language";
  public static final String LANGUAGE_EN_AU = "pref.language.en_au";
  public static final String LANGUAGE_EN_GB = "pref.language.en_gb";
  public static final String LANGUAGE_EN_US = "pref.language.en_us";
  public static final String LAST_CONNECTION_TEST_PASSED = "appstate.last_conn_test_passed";
  public static final String LED_RECORD = "behavior.led";
  public static final String LED_RECORD_BLUE_ANIMATED = "behavior.led.blue_animated";
  public static final String LED_RECORD_OFF = "behavior.led.off";
  public static final String LED_RECORD_RED_SOLID = "behavior.led.red_solid";
  public static final String LOCATION_AWARENESS = "pref.location.awareness";
  public static final String SETTINGS_VERSION = "settings.internal.version";
  public static final String TEST_NETWORK_NAME = "appstate.network_name";
  public static final String TTS_PLAYBACK = "tts.playback";
  public static final String TTS_PLAYBACK_BRIEF = "tts.playback.brief";
  public static final String TTS_PLAYBACK_BT = "tts.playback.bt";
  public static final String TTS_PLAYBACK_BT_BRIEF = "tts.playback.bt.brief";
  public static final String TTS_PLAYBACK_BT_FULL = "tts.playback.bt.full";
  public static final String TTS_PLAYBACK_BT_OFF = "tts.playback.bt.off";
  public static final String TTS_PLAYBACK_FULL = "tts.playback.full";
  public static final String TTS_PLAYBACK_OFF = "tts.playback.off";
  public static final String TTS_VOICE = "tts.voice";
  public static final String TTS_VOICE_FEMALE = "tts.voice.female";
  public static final String TTS_VOICE_MALE = "tts.voice.male";
  public static final String TTS_VOLUME = "tts.volume";
  public static final String TTS_VOLUME_LOUD = "tts.volume.loud";
  public static final String TTS_VOLUME_NORMAL = "tts.volume.normal";
  public static final String TTS_VOLUME_QUIET = "tts.volume.quiet";
  public static final String USE_BLUETOOTH = "bluetooth.enabled";
  public static final String VOICE_KEY = "behavior.voice_key";
  public static final String VOICE_KEY_BEHAVIOR = "behavior.asr_key_active";
  public static final String VOICE_KEY_BEHAVIOR_ALWAYS = "behavior.asr_key_active.always";
  public static final String VOICE_KEY_BEHAVIOR_WHEN_ACTIVE = "behavior.asr_key_active.when_active";
  public static final String VOICE_KEY_LEFT = "behavior.voice_key.left";
  public static final String VOICE_KEY_RIGHT = "behavior.voice_key.right";
  public static final String WORKING_APN = "appstate.working_apn";
  public static final String[][] alertTonesEnum;
  public static final String[][] asrKeyBehavior;
  public static final String[][] asrKeyNames;
  public static final String[][] connectionTypeEnum;
  public static final String[][] languageEnum;
  public static final String[][] ledRecordBehavior;
  public static final String[][] ttsPlaybackEnum;
  public static final String[][] ttsPlaybackEnumBt;
  public static final String[][] ttsVoiceEnum;
  public static final String[][] ttsVolumeEnum;

  static
  {
    String[][] arrayOfString;1 = new String[3][];
    String[] arrayOfString1 = new String[2];
    arrayOfString1[0] = "US English";
    arrayOfString1[1] = "pref.language.en_us";
    arrayOfString;1[0] = arrayOfString1;
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = "UK English";
    arrayOfString2[1] = "pref.language.en_gb";
    arrayOfString;1[1] = arrayOfString2;
    String[] arrayOfString3 = new String[2];
    arrayOfString3[0] = "Australian English";
    arrayOfString3[1] = "pref.language.en_au";
    arrayOfString;1[2] = arrayOfString3;
    languageEnum = arrayOfString;1;
    String[][] arrayOfString;2 = new String[3][];
    String[] arrayOfString4 = new String[2];
    arrayOfString4[0] = "Direct TCP";
    arrayOfString4[1] = "network.connection_type.directtcp";
    arrayOfString;2[0] = arrayOfString4;
    String[] arrayOfString5 = new String[2];
    arrayOfString5[0] = "BIS";
    arrayOfString5[1] = "network.connection_type.bis";
    arrayOfString;2[1] = arrayOfString5;
    String[] arrayOfString6 = new String[2];
    arrayOfString6[0] = "MDS";
    arrayOfString6[1] = "network.connection_type.mds";
    arrayOfString;2[2] = arrayOfString6;
    connectionTypeEnum = arrayOfString;2;
    String[][] arrayOfString;3 = new String[5][];
    String[] arrayOfString7 = new String[2];
    arrayOfString7[0] = "Off";
    arrayOfString7[1] = "behavior.alert_tones.off";
    arrayOfString;3[0] = arrayOfString7;
    String[] arrayOfString8 = new String[2];
    arrayOfString8[0] = "Vibrate";
    arrayOfString8[1] = "behavior.alert_tones.vibrate";
    arrayOfString;3[1] = arrayOfString8;
    String[] arrayOfString9 = new String[2];
    arrayOfString9[0] = "Quiet";
    arrayOfString9[1] = "behavior.alert_tones.low";
    arrayOfString;3[2] = arrayOfString9;
    String[] arrayOfString10 = new String[2];
    arrayOfString10[0] = "Normal";
    arrayOfString10[1] = "behavior.alert_tones.medium";
    arrayOfString;3[3] = arrayOfString10;
    String[] arrayOfString11 = new String[2];
    arrayOfString11[0] = "Loud";
    arrayOfString11[1] = "behavior.alert_tones.high";
    arrayOfString;3[4] = arrayOfString11;
    alertTonesEnum = arrayOfString;3;
    String[][] arrayOfString;4 = new String[2][];
    String[] arrayOfString12 = new String[2];
    arrayOfString12[0] = "Left";
    arrayOfString12[1] = "behavior.voice_key.left";
    arrayOfString;4[0] = arrayOfString12;
    String[] arrayOfString13 = new String[2];
    arrayOfString13[0] = "Right";
    arrayOfString13[1] = "behavior.voice_key.right";
    arrayOfString;4[1] = arrayOfString13;
    asrKeyNames = arrayOfString;4;
    String[][] arrayOfString;5 = new String[2][];
    String[] arrayOfString14 = new String[2];
    arrayOfString14[0] = "Anywhere";
    arrayOfString14[1] = "behavior.asr_key_active.always";
    arrayOfString;5[0] = arrayOfString14;
    String[] arrayOfString15 = new String[2];
    arrayOfString15[0] = "Only On Vlingo Home";
    arrayOfString15[1] = "behavior.asr_key_active.when_active";
    arrayOfString;5[1] = arrayOfString15;
    asrKeyBehavior = arrayOfString;5;
    String[][] arrayOfString;6 = new String[3][];
    String[] arrayOfString16 = new String[2];
    arrayOfString16[0] = "Off";
    arrayOfString16[1] = "behavior.led.off";
    arrayOfString;6[0] = arrayOfString16;
    String[] arrayOfString17 = new String[2];
    arrayOfString17[0] = "Solid Red";
    arrayOfString17[1] = "behavior.led.red_solid";
    arrayOfString;6[1] = arrayOfString17;
    String[] arrayOfString18 = new String[2];
    arrayOfString18[0] = "Animated Blue";
    arrayOfString18[1] = "behavior.led.blue_animated";
    arrayOfString;6[2] = arrayOfString18;
    ledRecordBehavior = arrayOfString;6;
    String[][] arrayOfString;7 = new String[3][];
    String[] arrayOfString19 = new String[2];
    arrayOfString19[0] = "Quiet";
    arrayOfString19[1] = "tts.volume.quiet";
    arrayOfString;7[0] = arrayOfString19;
    String[] arrayOfString20 = new String[2];
    arrayOfString20[0] = "Normal";
    arrayOfString20[1] = "tts.volume.normal";
    arrayOfString;7[1] = arrayOfString20;
    String[] arrayOfString21 = new String[2];
    arrayOfString21[0] = "Loud";
    arrayOfString21[1] = "tts.volume.loud";
    arrayOfString;7[2] = arrayOfString21;
    ttsVolumeEnum = arrayOfString;7;
    String[][] arrayOfString;8 = new String[2][];
    String[] arrayOfString22 = new String[2];
    arrayOfString22[0] = "Female";
    arrayOfString22[1] = "tts.voice.female";
    arrayOfString;8[0] = arrayOfString22;
    String[] arrayOfString23 = new String[2];
    arrayOfString23[0] = "Male";
    arrayOfString23[1] = "tts.voice.male";
    arrayOfString;8[1] = arrayOfString23;
    ttsVoiceEnum = arrayOfString;8;
    String[][] arrayOfString;9 = new String[3][];
    String[] arrayOfString24 = new String[2];
    arrayOfString24[0] = "Off";
    arrayOfString24[1] = "tts.playback.off";
    arrayOfString;9[0] = arrayOfString24;
    String[] arrayOfString25 = new String[2];
    arrayOfString25[0] = "Brief";
    arrayOfString25[1] = "tts.playback.brief";
    arrayOfString;9[1] = arrayOfString25;
    String[] arrayOfString26 = new String[2];
    arrayOfString26[0] = "Full";
    arrayOfString26[1] = "tts.playback.full";
    arrayOfString;9[2] = arrayOfString26;
    ttsPlaybackEnum = arrayOfString;9;
    String[][] arrayOfString;10 = new String[3][];
    String[] arrayOfString27 = new String[2];
    arrayOfString27[0] = "Off";
    arrayOfString27[1] = "tts.playback.bt.off";
    arrayOfString;10[0] = arrayOfString27;
    String[] arrayOfString28 = new String[2];
    arrayOfString28[0] = "Brief";
    arrayOfString28[1] = "tts.playback.bt.brief";
    arrayOfString;10[1] = arrayOfString28;
    String[] arrayOfString29 = new String[2];
    arrayOfString29[0] = "Full";
    arrayOfString29[1] = "tts.playback.bt.full";
    arrayOfString;10[2] = arrayOfString29;
    ttsPlaybackEnumBt = arrayOfString;10;
  }

  public static int getIndexForEnumWithValue(String[][] paramArrayOfString, String paramString)
  {
    int i = 0;
    if (i < paramArrayOfString.length)
      if (!paramArrayOfString[i][0].equals(paramString));
    while (true)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }
}

/* Location:           C:\Users\nigeluno\Desktop\APK2Java\tools\classes-dex2jar.jar
 * Qualified Name:     com.vlingo.core.internal.settings.util.CoreSettings
 * JD-Core Version:    0.6.0
 */