package com.sec.android.ims;

public abstract interface ImsConstants
{
  public static final int AddRouteToAdress = 22;
  public static final int AlarmTimerCancel = 21;
  public static final int AlarmTimerSet = 20;
  public static final int FUNC_CONTACT_ADD = 42;
  public static final int FUNC_CONTACT_ADD_FAV_LIST = 67;
  public static final int FUNC_CONTACT_BLOCK_LIST = 47;
  public static final int FUNC_CONTACT_DELETE = 44;
  public static final int FUNC_CONTACT_DELETE_FAV_LIST = 68;
  public static final int FUNC_CONTACT_DEREGISTER = 41;
  public static final int FUNC_CONTACT_EDIT = 43;
  public static final int FUNC_CONTACT_GET_PRESENCE = 49;
  public static final int FUNC_CONTACT_GET_PRESENCE_WATCHERLIST = 50;
  public static final int FUNC_CONTACT_LIST_NAMES = 46;
  public static final int FUNC_CONTACT_PRESENCE_SUBSCRIBE_WATCHERLIST = 65;
  public static final int FUNC_CONTACT_PRESENCE_UNSUBSCRIBE_WATCHERLIST = 66;
  public static final int FUNC_CONTACT_PUBLISH_PRESENCE = 59;
  public static final int FUNC_CONTACT_REGISTER = 40;
  public static final int FUNC_CONTACT_REMOVE_BLOCK = 48;
  public static final int FUNC_CONTACT_SET_HOMEPAGE_URL = 54;
  public static final int FUNC_CONTACT_SET_PRES_ACTIVITY = 57;
  public static final int FUNC_CONTACT_SET_PRES_HYPERAVAILABILITY = 51;
  public static final int FUNC_CONTACT_SET_PRES_ICON = 53;
  public static final int FUNC_CONTACT_SET_PRES_MOOD = 58;
  public static final int FUNC_CONTACT_SET_PRES_OVERRIDING_WILLINGNESS = 52;
  public static final int FUNC_CONTACT_SET_SERVICE_STATUS = 56;
  public static final int FUNC_CONTACT_SET_USERNOTE = 55;
  public static final int FUNC_CONTACT_SUBSCRIBE_PRESENCE = 61;
  public static final int FUNC_CONTACT_SUBSCRIBE_PRESENCELIST = 63;
  public static final int FUNC_CONTACT_UNPUBLISH_PRESENCE = 60;
  public static final int FUNC_CONTACT_UNSUBSCRIBE_PRESENCE = 62;
  public static final int FUNC_CONTACT_UNSUBSCRIBE_PRESENCELIST = 64;
  public static final int FUNC_CREATE_USER_PROFILE = 71;
  public static final int FUNC_EAB_GET_CONTACT_LIST = 45;
  public static final int FUNC_EAB_PUBLISH_AVIALABILITY = 90;
  public static final int FUNC_EAB_SUBSCRIBE_CONTACT = 89;
  public static final int FUNC_EAB_SUBSCRIBE_CONTACTLIST = 88;
  public static final int FUNC_GET_CONTACT_FROM_LIST = 72;
  public static final int FUNC_GET_PRESENCE_LIST_CONTACTS = 70;
  public static final int FUNC_GET_PRESENCE_LIST_NAMES = 69;
  public static final int FUNC_SEND_CONTACT_FILTER_OPTIONS = 73;
  public static final int IMS_ALREADY_IN_CALL = 213;
  public static final int IMS_APP_CONFIG_RETRY = 119;
  public static final int IMS_CALLSWAP_ACTIVEUSE_IND = 292;
  public static final int IMS_CALL_5XX_RESPONSE = 361;
  public static final int IMS_CALL_ADDRESS_INCOMPLETE = 308;
  public static final int IMS_CALL_ALERTING = 205;
  public static final int IMS_CALL_ALERTTONE_STOP = 358;
  public static final int IMS_CALL_ALTERNATIVE_SERVICES_ONLY = 357;
  public static final int IMS_CALL_ANNOUNCEMENT = 296;
  public static final int IMS_CALL_BUSY = 217;
  public static final int IMS_CALL_BYE_TIMEOUT = 211;
  public static final int IMS_CALL_CODEC_EXIT_SUCCESS = 240;
  public static final int IMS_CALL_CODEC_FAILURE = 238;
  public static final int IMS_CALL_CODEC_INIT_SUCCESS = 239;
  public static final int IMS_CALL_DISCONNECTED = 207;
  public static final int IMS_CALL_DTMF_ALREADY_INPROG = 275;
  public static final int IMS_CALL_DTMF_PROCESSED_IND = 274;
  public static final int IMS_CALL_EARLY_MEDIA_INPROGRESS = 356;
  public static final int IMS_CALL_ESTABLISHED = 208;
  public static final int IMS_CALL_ESTABLISHED_NO_URI_DISPLAY = 330;
  public static final int IMS_CALL_FAILED = 214;
  public static final int IMS_CALL_FAR_FRAME_READY = 302;
  public static final int IMS_CALL_FILEFEED_COMPLETE = 250;
  public static final int IMS_CALL_FILEFEED_FAILURE = 251;
  public static final int IMS_CALL_FILE_RX_FAILED = 253;
  public static final int IMS_CALL_FILE_TX_BAD = 248;
  public static final int IMS_CALL_FORBIDDEN = 303;
  public static final int IMS_CALL_FORBIDDEN_RSN_EXPIRED = 354;
  public static final int IMS_CALL_FORBIDDEN_RSN_GROUP_CALL_SERVICE_UNAVAILABLE = 355;
  public static final int IMS_CALL_FORBIDDEN_RSN_OUTGOING_CALLS_IMPOSSIBLE = 352;
  public static final int IMS_CALL_FORBIDDEN_RSN_TEMPORARY_DISABILITY = 353;
  public static final int IMS_CALL_HELD_IND = 265;
  public static final int IMS_CALL_HOLD_FAILED = 294;
  public static final int IMS_CALL_HOLD_FAILED_IND = 263;
  public static final int IMS_CALL_INCOMING_NOTIFY = 281;
  public static final int IMS_CALL_INCOMING_REFER_REQ = 277;
  public static final int IMS_CALL_INCOMMING_IND = 202;
  public static final int IMS_CALL_INCOMMING_REPLACES_IND = 288;
  public static final int IMS_CALL_INVALID_STATE = 201;
  public static final int IMS_CALL_IN_PROGRESS = 203;
  public static final int IMS_CALL_IS_FORWARDED = 206;
  public static final int IMS_CALL_LOCAL_CAPTURE_FAILURE = 299;
  public static final int IMS_CALL_LOCAL_CAPTURE_SUCCESS = 298;
  public static final int IMS_CALL_MAX = 370;
  public static final int IMS_CALL_METHOD_NOT_ALLOWED = 304;
  public static final int IMS_CALL_MM_APP_DEREG_FAILURE = 316;
  public static final int IMS_CALL_MM_APP_DEREG_SUCCESS = 315;
  public static final int IMS_CALL_MM_APP_REG_FAILURE = 329;
  public static final int IMS_CALL_MM_APP_REG_SUCCESS = 328;
  public static final int IMS_CALL_NETWORK_UNREACHABLE = 218;
  public static final int IMS_CALL_NONE = 200;
  public static final int IMS_CALL_NOT_ACCEPTABLE = 305;
  public static final int IMS_CALL_NOT_ACCEPTABLE_DIVERT = 314;
  public static final int IMS_CALL_NOT_FOUND = 215;
  public static final int IMS_CALL_RECV_OPTION_ACCEPT = 1;
  public static final int IMS_CALL_RECV_OPTION_MAX = 5;
  public static final int IMS_CALL_RECV_OPTION_NONE = 0;
  public static final int IMS_CALL_RECV_OPTION_REJECT_AS_BUSY = 4;
  public static final int IMS_CALL_RECV_OPTION_REJECT_AS_DECLINE = 2;
  public static final int IMS_CALL_RECV_OPTION_REJECT_AS_TRANSACTION_CLOSE = 3;
  public static final int IMS_CALL_REFER_REQ_ACCEPTED = 279;
  public static final int IMS_CALL_REFER_REQ_REJECTED = 280;
  public static final int IMS_CALL_REJECTED = 210;
  public static final int IMS_CALL_REMOTE_CAPTURE_FAILURE = 301;
  public static final int IMS_CALL_REMOTE_CAPTURE_SUCCESS = 300;
  public static final int IMS_CALL_REQ_FAILED = 212;
  public static final int IMS_CALL_REQ_REJECTED = 291;
  public static final int IMS_CALL_REQ_TERMINATED = 307;
  public static final int IMS_CALL_RESUME_FAILED = 295;
  public static final int IMS_CALL_RETRIEVE_FAILED_IND = 264;
  public static final int IMS_CALL_RETRIEVE_IND = 266;
  public static final int IMS_CALL_RX_ACTIVATE_DONE = 243;
  public static final int IMS_CALL_RX_DEACTIVATE_DONE = 245;
  public static final int IMS_CALL_SEND_DTMF_FAILURE = 276;
  public static final int IMS_CALL_SEND_IMAGE_DONE = 246;
  public static final int IMS_CALL_SEND_IMAGE_FAILED = 247;
  public static final int IMS_CALL_SEND_INFO = 293;
  public static final int IMS_CALL_SEND_REFER_FAILED = 278;
  public static final int IMS_CALL_SERVER_INTERNAL_ERR = 311;
  public static final int IMS_CALL_SERVICE_CHANGE_IND_EVENT = 232;
  public static final int IMS_CALL_SERVICE_NOTIFICATION = 289;
  public static final int IMS_CALL_SERVICE_UNAVAILABLE = 309;
  public static final int IMS_CALL_SHOW_FAR_FRAME = 273;
  public static final int IMS_CALL_SHOW_NEAR_FRAME = 272;
  public static final int IMS_CALL_START_FILEFEED = 249;
  public static final int IMS_CALL_START_RECORDING = 252;
  public static final int IMS_CALL_STATUS_ADD_USER_TO_SESSION_FAILURE = 321;
  public static final int IMS_CALL_STATUS_ADD_USER_TO_SESSION_SUCCESS = 322;
  public static final int IMS_CALL_STATUS_CONF_SESSIONSTART_FAILED = 320;
  public static final int IMS_CALL_STATUS_CONF_SESSIONSTART_SUCCESS = 319;
  public static final int IMS_CALL_STATUS_NTFY_SESSPRTCPNTS_UPDATED_IND = 325;
  public static final int IMS_CALL_STATUS_REMOVE_USER_FROM_SESSION_FAILURE = 323;
  public static final int IMS_CALL_STATUS_REMOVE_USER_FROM_SESSION_SUCCESS = 324;
  public static final int IMS_CALL_STATUS_SESSION_MODIFY2CONFERECE = 327;
  public static final int IMS_CALL_STOP_RECORDING_DURATION_REACHED = 255;
  public static final int IMS_CALL_STOP_RECORDING_FAILURE = 257;
  public static final int IMS_CALL_STOP_RECORDING_STORAGE_FULL = 256;
  public static final int IMS_CALL_STOP_RECORDING_USER_STOPPED = 254;
  public static final int IMS_CALL_SWAP_COMPLETED_IND = 262;
  public static final int IMS_CALL_SWAP_INPROGRESS_IND = 261;
  public static final int IMS_CALL_SWITCH_FAILED = 271;
  public static final int IMS_CALL_SWITCH_FAILURE = 335;
  public static final int IMS_CALL_SWITCH_IND = 267;
  public static final int IMS_CALL_SWITCH_REJECTED = 336;
  public static final int IMS_CALL_SWITCH_REQUEST = 268;
  public static final int IMS_CALL_SWITCH_RESPONSE = 269;
  public static final int IMS_CALL_SWITCH_VIDEO_ACTIVE = 347;
  public static final int IMS_CALL_SWITCH_VIDEO_ACTIVE_SUCCESS = 348;
  public static final int IMS_CALL_SWITCH_VIDEO_INACTIVE = 345;
  public static final int IMS_CALL_SWITCH_VIDEO_INACTIVE_SUCCESS = 346;
  public static final int IMS_CALL_SWITCH_VOIP_TO_VSH = 337;
  public static final int IMS_CALL_SWITCH_VOIP_TO_VSH_SUCCESS = 340;
  public static final int IMS_CALL_SWITCH_VOIP_TO_VT = 332;
  public static final int IMS_CALL_SWITCH_VOIP_TO_VT_SUCCESS = 334;
  public static final int IMS_CALL_SWITCH_VSH_TO_VOIP = 338;
  public static final int IMS_CALL_SWITCH_VSH_TO_VOIP_SUCCESS = 342;
  public static final int IMS_CALL_SWITCH_VSH_TO_VT = 343;
  public static final int IMS_CALL_SWITCH_VSH_TO_VT_SUCCESS = 344;
  public static final int IMS_CALL_SWITCH_VT_TO_VOIP = 331;
  public static final int IMS_CALL_SWITCH_VT_TO_VOIP_SUCCESS = 333;
  public static final int IMS_CALL_SWITCH_VT_TO_VSH = 339;
  public static final int IMS_CALL_SWITCH_VT_TO_VSH_SUCCESS = 341;
  public static final int IMS_CALL_TEMP_UNAVAILABLE = 216;
  public static final int IMS_CALL_TEMP_UNAVAILABLE_WITH_CAUSE = 360;
  public static final int IMS_CALL_TIMEOUT = 219;
  public static final int IMS_CALL_TRANSFERED = 290;
  public static final int IMS_CALL_TRANSFER_FAILED = 283;
  public static final int IMS_CALL_TRANSFER_SUCCESS = 282;
  public static final int IMS_CALL_TRYING = 204;
  public static final int IMS_CALL_TX_ACTIVATE_DONE = 242;
  public static final int IMS_CALL_TX_DEACTIVATE_DONE = 244;
  public static final int IMS_CALL_TYPE_HDVT = 5;
  public static final int IMS_CALL_TYPE_HDVT_LAND = 6;
  public static final int IMS_CALL_TYPE_HDVT_QVGA = 9;
  public static final int IMS_CALL_TYPE_HDVT_QVGA_LAND = 8;
  public static final int IMS_CALL_TYPE_NULL = 0;
  public static final int IMS_CALL_TYPE_POC = 3;
  public static final int IMS_CALL_TYPE_VOIP = 2;
  public static final int IMS_CALL_TYPE_VT = 1;
  public static final int IMS_CALL_TYPE_VT_LAND = 7;
  public static final int IMS_CALL_UNBLOCK_CODEC_SETTING = 241;
  public static final int IMS_CALL_UNSUPPORTED_MEDIA = 306;
  public static final int IMS_CALL_USER_POWERED_OFF = 310;
  public static final int IMS_CALL_WAITING_CONNECT_IND = 259;
  public static final int IMS_CALL_WAITING_DISCONNECTED_IND = 260;
  public static final int IMS_CALL_WAITING_IND = 258;
  public static final int IMS_CALL_WAITING_REINVITE = 270;
  public static final int IMS_CAMERA_START_FAILURE_EVT = 313;
  public static final int IMS_CAMERA_START_SUCCESS_EVT = 312;
  public static final int IMS_CFG_ALWAYS_ON = 10;
  public static final int IMS_CFG_AUDIO_CODEC = 6;
  public static final int IMS_CFG_AUDIO_CODEC_MODE = 21;
  public static final int IMS_CFG_AUDIO_FIRST = 13;
  public static final int IMS_CFG_AUTO_TEST = 16;
  public static final int IMS_CFG_CLIR = 27;
  public static final int IMS_CFG_CUR_DISP_FRMT = 19;
  public static final int IMS_CFG_CUR_LATCH_NW = 18;
  public static final int IMS_CFG_ENABLE_QOS = 11;
  public static final int IMS_CFG_FRAME_RATE = 20;
  public static final int IMS_CFG_LOOPBACK = 9;
  public static final int IMS_CFG_MAX = 28;
  public static final int IMS_CFG_NONE = 0;
  public static final int IMS_CFG_PACCESS_NW_INFO = 24;
  public static final int IMS_CFG_PCSCF_DNS = 1;
  public static final int IMS_CFG_PCSCF_DNS_WIFI = 25;
  public static final int IMS_CFG_PCSCF_DOMAIN = 3;
  public static final int IMS_CFG_PCSCF_IP = 2;
  public static final int IMS_CFG_PCSCF_PORT = 4;
  public static final int IMS_CFG_PREFERRED_ID = 28;
  public static final int IMS_CFG_PREF_NWK_TYPE = 17;
  public static final int IMS_CFG_PRIV_USER_IDENTY = 23;
  public static final int IMS_CFG_PUB_USER_IDENTY = 22;
  public static final int IMS_CFG_QOS_AWARE = 14;
  public static final int IMS_CFG_VIDEO_CODEC = 5;
  public static final int IMS_CFG_VIDEO_PROFILE = 12;
  public static final int IMS_CFG_VT_DEBUGGING = 15;
  public static final int IMS_CFG_XDM_DNS = 7;
  public static final int IMS_CFG_XDM_IP = 8;
  public static final int IMS_CFG_XDM_IP_WIFI = 26;
  public static final int IMS_CONF_ADD_USER_FAIL = 286;
  public static final int IMS_CONF_MEDIASERVER_CONNECT_FAILED = 285;
  public static final int IMS_CONF_PARTICIPANT_ACTIVE = 2;
  public static final int IMS_CONF_PARTICIPANT_ALERTING = 5;
  public static final int IMS_CONF_PARTICIPANT_INVALID = 0;
  public static final int IMS_CONF_PARTICIPANT_INVITING = 1;
  public static final int IMS_CONF_PARTICIPANT_MAX = 7;
  public static final int IMS_CONF_PARTICIPANT_NON_ACTIVE = 4;
  public static final int IMS_CONF_PARTICIPANT_ONHOLD = 6;
  public static final int IMS_CONF_PARTICIPANT_REMOVING = 3;
  public static final int IMS_CONF_TWC_CONNECTED = 287;
  public static final int IMS_DEINIT_VIDEO = 297;
  public static final int IMS_DEREGISTRATION_FAILED = 107;
  public static final int IMS_DEREGISTRATION_SUCCEED = 106;
  public static final int IMS_DEREG_REQ_FAILED = 105;
  public static final int IMS_FAILED_TO_GO_READY = 237;
  public static final int IMS_IMMS_FAILURE_RESTART = 362;
  public static final int IMS_NETWORK_DISCONNECT = 359;
  public static final int IMS_NETWORK_TRANSITION_LTE_TO_3G = 351;
  public static final int IMS_NOT_REGISTERED = 101;
  public static final int IMS_NWK_TYPE_HIPRI = 3;
  public static final int IMS_NWK_TYPE_MOBILE = 0;
  public static final int IMS_NWK_TYPE_MOBILE_IMS = 1;
  public static final int IMS_NWK_TYPE_NONE = -1;
  public static final int IMS_NWK_TYPE_WIFI = 2;
  public static final int IMS_PPP_OPEN_FAILURE = 222;
  public static final int IMS_PPP_OPEN_SUCCESS = 221;
  public static final int IMS_PPP_OPEN_TRYING = 220;
  public static final int IMS_PPP_STATUS_CHANGE_IND_EVENT = 233;
  public static final int IMS_PPP_STATUS_CLOSE_EVENT = 234;
  public static final int IMS_QOS_FAILURE = 228;
  public static final int IMS_QOS_INCALL_SUSPEND = 230;
  public static final int IMS_QOS_INCALL_UNAWARE = 231;
  public static final int IMS_QOS_NW_UNAWARE = 229;
  public static final int IMS_QOS_SUCCESS = 227;
  public static final int IMS_QOS_TRYING = 226;
  public static final int IMS_READY_TO_GO = 236;
  public static final int IMS_REGISTRATION_FAILED = 104;
  public static final int IMS_REGISTRATION_REFRESH_SUCCEED = 123;
  public static final int IMS_REGISTRATION_RETRY_FAILED = 120;
  public static final int IMS_REGISTRATION_SUCCEED = 102;
  public static final int IMS_REG_AUTH_CHALLENGE = 117;
  public static final int IMS_REG_LIMITED_ACCESS_MODE = 116;
  public static final int IMS_REG_MAX = 199;
  public static final int IMS_REG_NETWORK_UNREACHABLE = 108;
  public static final int IMS_REG_NONE = 100;
  public static final int IMS_REG_NOT_SUBSCRIBED = 113;
  public static final int IMS_REG_REQ_FAILED = 103;
  public static final int IMS_REG_RETRY_MUL_PCSCFIP_FAILED = 124;
  public static final int IMS_REG_SERVER_ERROR = 111;
  public static final int IMS_REG_SRV_UNAVAIL = 110;
  public static final int IMS_REG_TEMP_ERROR = 112;
  public static final int IMS_REG_TIMEOUT = 109;
  public static final int IMS_REREG_FAILED = 118;
  public static final int IMS_RTP_NO_PACKET_FOR_10SEC = 235;
  public static final int IMS_SERVICE_STARTED = 1001;
  public static final int IMS_SESSION_ABORT = 317;
  public static final int IMS_SESSION_ACK_TIMEOUT = 318;
  public static final int IMS_SESSION_TERMINATED = 209;
  public static final int IMS_SIP_REG_FAILURE = 225;
  public static final int IMS_SIP_REG_SUCCESS = 224;
  public static final int IMS_SIP_REG_TRYING = 223;
  public static final int IMS_SIP_TXN_COMPLETED = 369;
  public static final int IMS_SIP_TXN_INPRG = 368;
  public static final int IMS_SMSIP_CTYPE_3GPP = 0;
  public static final int IMS_SMSIP_CTYPE_3GPP2 = 1;
  public static final int IMS_SMSIP_TEXT_PLAIN = 2;
  public static final int IMS_SVC_EAB_ACTIVITY_APPOINTMENT = 0;
  public static final int IMS_SVC_EAB_ACTIVITY_AVAILABLE = 28;
  public static final int IMS_SVC_EAB_ACTIVITY_AWAY = 1;
  public static final int IMS_SVC_EAB_ACTIVITY_BASE = 0;
  public static final int IMS_SVC_EAB_ACTIVITY_BREAKFAST = 2;
  public static final int IMS_SVC_EAB_ACTIVITY_BUSY = 3;
  public static final int IMS_SVC_EAB_ACTIVITY_CONFIRM = 29;
  public static final int IMS_SVC_EAB_ACTIVITY_DINNER = 4;
  public static final int IMS_SVC_EAB_ACTIVITY_FIND_ME = 31;
  public static final int IMS_SVC_EAB_ACTIVITY_HOLIDAY = 5;
  public static final int IMS_SVC_EAB_ACTIVITY_INVALID = -1;
  public static final int IMS_SVC_EAB_ACTIVITY_INVISIBLE = 30;
  public static final int IMS_SVC_EAB_ACTIVITY_IN_TRANSIT = 6;
  public static final int IMS_SVC_EAB_ACTIVITY_LOOKING_FOR_WORK = 7;
  public static final int IMS_SVC_EAB_ACTIVITY_LUNCH = 8;
  public static final int IMS_SVC_EAB_ACTIVITY_MAX_ACTIVITIES = 27;
  public static final int IMS_SVC_EAB_ACTIVITY_MEAL = 9;
  public static final int IMS_SVC_EAB_ACTIVITY_MEETING = 10;
  public static final int IMS_SVC_EAB_ACTIVITY_ON_THE_PHONE = 11;
  public static final int IMS_SVC_EAB_ACTIVITY_OTHER = 12;
  public static final int IMS_SVC_EAB_ACTIVITY_PERFORMANCE = 13;
  public static final int IMS_SVC_EAB_ACTIVITY_PERMANENT_ABSENCE = 14;
  public static final int IMS_SVC_EAB_ACTIVITY_PLAYING = 15;
  public static final int IMS_SVC_EAB_ACTIVITY_PRESENTATION = 16;
  public static final int IMS_SVC_EAB_ACTIVITY_SHOPPING = 17;
  public static final int IMS_SVC_EAB_ACTIVITY_SLEEPING = 18;
  public static final int IMS_SVC_EAB_ACTIVITY_SPECTATOR = 19;
  public static final int IMS_SVC_EAB_ACTIVITY_STEERING = 20;
  public static final int IMS_SVC_EAB_ACTIVITY_TRAVEL = 21;
  public static final int IMS_SVC_EAB_ACTIVITY_TV = 22;
  public static final int IMS_SVC_EAB_ACTIVITY_UNKNOWN = 23;
  public static final int IMS_SVC_EAB_ACTIVITY_VACATION = 24;
  public static final int IMS_SVC_EAB_ACTIVITY_WORKING = 25;
  public static final int IMS_SVC_EAB_ALREADY_EXIST = -3;
  public static final int IMS_SVC_EAB_APP_CONN_HANDLE = 700;
  public static final int IMS_SVC_EAB_APP_INDICATION_BASE = 1100;
  public static final int IMS_SVC_EAB_APP_INDICATION_CONTACT_LIST_CREATED = 1105;
  public static final int IMS_SVC_EAB_APP_INDICATION_CONTACT_LIST_DELETED = 1107;
  public static final int IMS_SVC_EAB_APP_INDICATION_CONTACT_LIST_UPDATED = 1106;
  public static final int IMS_SVC_EAB_APP_INDICATION_HYPER_OFF = 1104;
  public static final int IMS_SVC_EAB_APP_INDICATION_INVALID = 1100;
  public static final int IMS_SVC_EAB_APP_INDICATION_MAX = 1115;
  public static final int IMS_SVC_EAB_APP_INDICATION_PRESENCE_AUTH_RULE_CREATED = 1111;
  public static final int IMS_SVC_EAB_APP_INDICATION_PRESENCE_AUTH_RULE_DELETED = 1113;
  public static final int IMS_SVC_EAB_APP_INDICATION_PRESENCE_AUTH_RULE_UPDATED = 1112;
  public static final int IMS_SVC_EAB_APP_INDICATION_PRESENCE_INFO = 1101;
  public static final int IMS_SVC_EAB_APP_INDICATION_PRESENCE_LIST_CREATED = 1108;
  public static final int IMS_SVC_EAB_APP_INDICATION_PRESENCE_LIST_DELETED = 1110;
  public static final int IMS_SVC_EAB_APP_INDICATION_PRESENCE_LIST_INFO = 1102;
  public static final int IMS_SVC_EAB_APP_INDICATION_PRESENCE_LIST_UPDATED = 1109;
  public static final int IMS_SVC_EAB_APP_INDICATION_WATCHER_INFO = 1103;
  public static final int IMS_SVC_EAB_APP_RESPONSE_ADD_USER_FAILURE = 1020;
  public static final int IMS_SVC_EAB_APP_RESPONSE_ADD_USER_GROUP_FAILURE = 1048;
  public static final int IMS_SVC_EAB_APP_RESPONSE_ADD_USER_GROUP_SUCCESS = 1047;
  public static final int IMS_SVC_EAB_APP_RESPONSE_ADD_USER_SUCCESS = 1019;
  public static final int IMS_SVC_EAB_APP_RESPONSE_BASE = 1000;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CONTACT_LIST_CREATE_FAILURE = 1014;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CONTACT_LIST_CREATE_SUCCESS = 1013;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CONTACT_LIST_DELETED_FAILURE = 1018;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CONTACT_LIST_DELETED_SUCCESS = 1017;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CONTACT_LIST_RENAME_FAILURE = 1016;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CONTACT_LIST_RENAME_SUCCESS = 1015;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CREATE_AUTH_POLICY_FAILURE = 1054;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CREATE_AUTH_POLICY_SUCCESS = 1053;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CREATE_GROUP_FAILURE = 1044;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CREATE_GROUP_SUCCESS = 1043;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CREATE_RLS_SERVICE_FAILURE = 1026;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CREATE_RLS_SERVICE_SUCCESS = 1025;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CREATE_USER_PROFILE_FAILURE = 1066;
  public static final int IMS_SVC_EAB_APP_RESPONSE_CREATE_USER_PROFILE_SUCCESS = 1065;
  public static final int IMS_SVC_EAB_APP_RESPONSE_DELETE_AUTH_POLICY_FAILURE = 1058;
  public static final int IMS_SVC_EAB_APP_RESPONSE_DELETE_AUTH_POLICY_SUCCESS = 1057;
  public static final int IMS_SVC_EAB_APP_RESPONSE_DELETE_GROUP_FAILURE = 1046;
  public static final int IMS_SVC_EAB_APP_RESPONSE_DELETE_GROUP_SUCCESS = 1045;
  public static final int IMS_SVC_EAB_APP_RESPONSE_DELETE_RLS_SERVICE_FAILURE = 1028;
  public static final int IMS_SVC_EAB_APP_RESPONSE_DELETE_RLS_SERVICE_SUCCESS = 1027;
  public static final int IMS_SVC_EAB_APP_RESPONSE_DELETE_USER_FAILURE = 1022;
  public static final int IMS_SVC_EAB_APP_RESPONSE_DELETE_USER_GROUP_FAILURE = 1050;
  public static final int IMS_SVC_EAB_APP_RESPONSE_DELETE_USER_GROUP_SUCCESS = 1049;
  public static final int IMS_SVC_EAB_APP_RESPONSE_DELETE_USER_PROFILE_FAILURE = 1072;
  public static final int IMS_SVC_EAB_APP_RESPONSE_DELETE_USER_PROFILE_SUCCESS = 1071;
  public static final int IMS_SVC_EAB_APP_RESPONSE_DELETE_USER_SUCCESS = 1021;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_CONTACT_FAILURE = 1030;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_CONTACT_INFO_FAILURE = 1040;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_CONTACT_INFO_SUCCESS = 1039;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_CONTACT_LIST_ATTR_FAILURE = 1038;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_CONTACT_LIST_ATTR_SUCCESS = 1037;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_CONTACT_LIST_FAILURE = 1034;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_CONTACT_LIST_MEMBERS_FAILURE = 1036;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_CONTACT_LIST_MEMBERS_SUCCESS = 1035;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_CONTACT_LIST_NAMES_FAILURE = 1032;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_CONTACT_LIST_NAMES_SUCCESS = 1031;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_CONTACT_LIST_SUCCESS = 1033;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_CONTACT_SUCCESS = 1029;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_GROUP_MEMBERS_FAILURE = 1052;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_GROUP_MEMBERS_SUCCESS = 1051;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_PRESENCE_LIST_URI_FAILURE = 1042;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_PRESENCE_LIST_URI_SUCCESS = 1041;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_USER_PROFILE_FAILURE = 1070;
  public static final int IMS_SVC_EAB_APP_RESPONSE_FETCH_USER_PROFILE_SUCCESS = 1069;
  public static final int IMS_SVC_EAB_APP_RESPONSE_GET_ACCEPT_LIST_FAILURE = 1062;
  public static final int IMS_SVC_EAB_APP_RESPONSE_GET_ACCEPT_LIST_SUCCESS = 1061;
  public static final int IMS_SVC_EAB_APP_RESPONSE_GET_BLOCK_LIST_FAILURE = 1060;
  public static final int IMS_SVC_EAB_APP_RESPONSE_GET_BLOCK_LIST_SUCCESS = 1059;
  public static final int IMS_SVC_EAB_APP_RESPONSE_GET_PRESENCE_LIST_FAILURE = 1064;
  public static final int IMS_SVC_EAB_APP_RESPONSE_GET_PRESENCE_LIST_SUCCESS = 1063;
  public static final int IMS_SVC_EAB_APP_RESPONSE_INVALID = 1000;
  public static final int IMS_SVC_EAB_APP_RESPONSE_MAX = 1075;
  public static final int IMS_SVC_EAB_APP_RESPONSE_PRESENCE_INFO_FAILURE = 1010;
  public static final int IMS_SVC_EAB_APP_RESPONSE_PRESENCE_INFO_SUCCESS = 1009;
  public static final int IMS_SVC_EAB_APP_RESPONSE_PUBLISH_FAILURE = 1004;
  public static final int IMS_SVC_EAB_APP_RESPONSE_PUBLISH_SUCCESS = 1003;
  public static final int IMS_SVC_EAB_APP_RESPONSE_QUERY_RMT_CAPABILITY_FAILURE = 1074;
  public static final int IMS_SVC_EAB_APP_RESPONSE_QUERY_RMT_CAPABILITY_SUCCESS = 1073;
  public static final int IMS_SVC_EAB_APP_RESPONSE_REGISTER_FAILURE = 1002;
  public static final int IMS_SVC_EAB_APP_RESPONSE_REGISTER_SUCCESS = 1001;
  public static final int IMS_SVC_EAB_APP_RESPONSE_UPDATE_AUTH_POLICY_FAILURE = 1056;
  public static final int IMS_SVC_EAB_APP_RESPONSE_UPDATE_AUTH_POLICY_SUCCESS = 1055;
  public static final int IMS_SVC_EAB_APP_RESPONSE_UPDATE_USER_FAILURE = 1024;
  public static final int IMS_SVC_EAB_APP_RESPONSE_UPDATE_USER_PROFILE_FAILURE = 1068;
  public static final int IMS_SVC_EAB_APP_RESPONSE_UPDATE_USER_PROFILE_SUCCESS = 1067;
  public static final int IMS_SVC_EAB_APP_RESPONSE_UPDATE_USER_SUCCESS = 1023;
  public static final int IMS_SVC_EAB_APP_RESPONSE_WATCHER_INFO_FAILURE = 1012;
  public static final int IMS_SVC_EAB_APP_RESPONSE_WATCHER_INFO_SUCCESS = 1011;
  public static final int IMS_SVC_EAB_APP_RESPONSE_WATCH_LISTENER_FAILURE = 1008;
  public static final int IMS_SVC_EAB_APP_RESPONSE_WATCH_LISTENER_SUCCESS = 1007;
  public static final int IMS_SVC_EAB_APP_RESPONSE_WATCH_USER_FAILURE = 1006;
  public static final int IMS_SVC_EAB_APP_RESPONSE_WATCH_USER_SUCCESS = 1005;
  public static final int IMS_SVC_EAB_AVAILABILITY_STATUS_CLOSED = 0;
  public static final int IMS_SVC_EAB_AVAILABILITY_STATUS_OPEN = 1;
  public static final int IMS_SVC_EAB_AVAILABILITY_STATUS_UNKNOWN = -1;
  public static final int IMS_SVC_EAB_CODE_MAX_RETURN_STATE = 2;
  public static final int IMS_SVC_EAB_CONTACTLIST_DETAILS = 704;
  public static final int IMS_SVC_EAB_CONTACTLIST_NAMES = 703;
  public static final int IMS_SVC_EAB_CONTACT_DETAILS = 702;
  public static final int IMS_SVC_EAB_CONTACT_URI_LIST = 701;
  public static final int IMS_SVC_EAB_DOESNOT_EXIST = -4;
  public static final int IMS_SVC_EAB_FAILURE = 0;
  public static final int IMS_SVC_EAB_GROUP_NAMES = 707;
  public static final int IMS_SVC_EAB_IN_PROGRESS = -1;
  public static final int IMS_SVC_EAB_MAX_RET_TYPE = 710;
  public static final int IMS_SVC_EAB_MY_PRES_INFO = 708;
  public static final int IMS_SVC_EAB_NOT_READY = -2;
  public static final int IMS_SVC_EAB_PRESENCELIST_DETAILS = 706;
  public static final int IMS_SVC_EAB_PRESENCELIST_NAMES = 705;
  public static final int IMS_SVC_EAB_PRES_SERVICE_TYPE_BASE = 0;
  public static final int IMS_SVC_EAB_PRES_STATUS_TYPE = 0;
  public static final int IMS_SVC_EAB_RETURN_BASE = 1200;
  public static final int IMS_SVC_EAB_RETURN_GET_CONTACT_FROM_LIST = 1201;
  public static final int IMS_SVC_EAB_RETURN_RESP_FORBIDDEN = 1403;
  public static final int IMS_SVC_EAB_RETURN_RESP_USR_NOT_FOUND = 1404;
  public static final int IMS_SVC_EAB_RET_TYPE = 700;
  public static final int IMS_SVC_EAB_RET_TYPE_NONE = -700;
  public static final int IMS_SVC_EAB_SERVICE_ID_CS_VIDEO_CALL = 1;
  public static final int IMS_SVC_EAB_SERVICE_ID_FILE_TRANSFER = 5;
  public static final int IMS_SVC_EAB_SERVICE_ID_IMAGE_SHARE = 3;
  public static final int IMS_SVC_EAB_SERVICE_ID_INVALID = -1;
  public static final int IMS_SVC_EAB_SERVICE_ID_MAX = 7;
  public static final int IMS_SVC_EAB_SERVICE_ID_OTHER = 6;
  public static final int IMS_SVC_EAB_SERVICE_ID_SESS_MODE_MESS = 4;
  public static final int IMS_SVC_EAB_SERVICE_ID_VIDEO_SHARE = 2;
  public static final int IMS_SVC_EAB_SUCCESS = 1;
  public static final int IMS_SVC_EAB_WATCHER_LIST = 709;
  public static final int IMS_SVC_IM_APPTYPE_CHAT = 1;
  public static final int IMS_SVC_IM_APPTYPE_FT = 2;
  public static final int IMS_SVC_IM_FAILURE = -1;
  public static final int IMS_SVC_IM_SUCCESS = 0;
  public static final int IMS_SVC_MM_RMT_HOLD = 9;
  public static final int IMS_SVC_MM_RMT_RESUME = 10;
  public static final int IMS_SVC_MM_VIDEO_ACTIVE = 7;
  public static final int IMS_SVC_MM_VIDEO_INACTIVE = 6;
  public static final int IMS_SVC_MM_VOIP_TO_VSH = 2;
  public static final int IMS_SVC_MM_VOIP_TO_VT = 0;
  public static final int IMS_SVC_MM_VSH_TO_VOIP = 3;
  public static final int IMS_SVC_MM_VSH_TO_VT = 5;
  public static final int IMS_SVC_MM_VT_TO_VOIP = 1;
  public static final int IMS_SVC_MM_VT_TO_VSH = 4;
  public static final int IMS_SVC_NAB_APP_INDICATION_PRESENCE_READY = 1114;
  public static final int IMS_SVC_REGISTER_APP = 3;
  public static final int IMS_SVC_REGISTER_CONNECTION_HANDLE = 4;
  public static final int IMS_SVC_REGISTER_CONNECTION_SUCCESSFUL = -1;
  public static final int IMS_WAIT_FOR_TARGET_DISCONNECT = 284;
  public static final int MAX_NO_IMS_REG_RETRY = 3;
  public static final int MAX_NO_IMS_REG_RETRY_ON_404 = 6;
  public static final int MOD_CONTACT_SVC = 3;
  public static final int MOD_SS = 1;
  public static final int MOD_VT = 0;
  public static final int MS_SVC_EAB_ACTIVITY_WORSHIP = 26;
  public static final int RemoveAllAdressFrmRouteTable = 24;
  public static final int RemoveAllRouteToAdress = 24;
  public static final int RemoveRouteToAdress = 23;
  public static final int SIP_ACCEPTED = 202;
  public static final int SIP_ADDRESS_AMBIGUOUS = 485;
  public static final int SIP_BAD_GATEWAY = 502;
  public static final int SIP_BAD_REQUEST = 400;
  public static final int SIP_BUSY_EVERYWHERE = 600;
  public static final int SIP_DOES_NOT_EXIST_ANYWHERE = 604;
  public static final int SIP_FORBIDDEN_MESSAGE = 403;
  public static final int SIP_GONE = 410;
  public static final int SIP_NOT_IMPLEMENTED = 501;
  public static final int SIP_OK = 200;
  public static final int SIP_REQUEST_TIMEOUT = 408;
  public static final int SIP_SERVER_INTERNAL_ERROR = 500;
  public static final int SIP_SERVICE_UNAVAILABLE = 503;
  public static final int SIP_TEMPORARILY_UNAVAILABLE = 480;
  public static final int SIP_UNAUTHORISED_USER = 401;
  public static final int SIP_USER_NOT_FOUND = 404;
  public static final int SMSIP_CST_ACCEPTED = 10;
  public static final int SMSIP_CST_DEREGISTERING = 3;
  public static final int SMSIP_CST_DISCONNECTING = 8;
  public static final int SMSIP_CST_FAILED = 9;
  public static final int SMSIP_CST_IDLE = 0;
  public static final int SMSIP_CST_NOT_REGISTERED = 1;
  public static final int SMSIP_CST_OPTIONS_EXCHANGED = 7;
  public static final int SMSIP_CST_RECEIVED = 11;
  public static final int SMSIP_CST_REGISTERING = 2;
  public static final int SMSIP_CST_SENDING_OPTIONS = 6;
  public static final int SMSIP_CST_SESSION_PROGRESS = 5;
  public static final int SMSIP_CST_TRYING = 4;
  public static final int SettingsPCMDumpFlag = 25;
  public static final int UI_APP_IM = 2;
  public static final int UI_APP_IM_MSRP = 11;
  public static final int UI_APP_MAX = 18;
  public static final int UI_APP_MIN = 0;
  public static final int UI_APP_MNGR = 9;
  public static final int UI_APP_POC = 1;
  public static final int UI_APP_PRES = 10;
  public static final int UI_APP_REG = 5;
  public static final int UI_APP_SMSIP = 3;
  public static final int UI_APP_SS_CH = 13;
  public static final int UI_APP_SS_CONFIG = 16;
  public static final int UI_APP_SS_CT = 14;
  public static final int UI_APP_SS_GEN = 12;
  public static final int UI_APP_SS_TWC = 15;
  public static final int UI_APP_TXN_INFO = 17;
  public static final int UI_APP_VOIP = 4;
  public static final int UI_APP_VSH = 6;
  public static final int UI_APP_VT = 8;
  public static final int UI_APP_XDM = 7;
  public static final int VT_DIAL_INVALID = 0;
  public static final int VT_DIAL_MAX = 5;
  public static final int VT_DIAL_SIPURI = 1;
  public static final int VT_DIAL_TELNO = 3;
  public static final int VT_DIAL_TELURI = 2;
  public static final int VT_DIAL_USERNAME = 4;
  public static final int XAN_CAM_SYNC_ERR = 2;
  public static final int XAN_CODEC_PARM_AUDIO_CODEC = 17;
  public static final int XAN_CODEC_PARM_AUDIO_CODEC_PT = 18;
  public static final int XAN_CODEC_PARM_AUDIO_DEVICE = 9;
  public static final int XAN_CODEC_PARM_AUDIO_EVRC_RATE = 7;
  public static final int XAN_CODEC_PARM_AUDIO_MUTE = 8;
  public static final int XAN_CODEC_PARM_AUDIO_RATE = 6;
  public static final int XAN_CODEC_PARM_AUDIO_VOLUME = 10;
  public static final int XAN_CODEC_PARM_CAMERA_BRIGHTNESS = 12;
  public static final int XAN_CODEC_PARM_CAMERA_COLOR_EFFECT = 13;
  public static final int XAN_CODEC_PARM_CAMERA_WHITE_BALANCE = 14;
  public static final int XAN_CODEC_PARM_CAMERA_ZOOM = 11;
  public static final int XAN_CODEC_PARM_MAX = 19;
  public static final int XAN_CODEC_PARM_VIDEO_BIT_RATE = 0;
  public static final int XAN_CODEC_PARM_VIDEO_CODEC = 16;
  public static final int XAN_CODEC_PARM_VIDEO_FRAME_RATE = 1;
  public static final int XAN_CODEC_PARM_VIDEO_INTRA_PERIOD = 3;
  public static final int XAN_CODEC_PARM_VIDEO_MUTE = 4;
  public static final int XAN_CODEC_PARM_VIDEO_QP = 2;
  public static final int XAN_CODEC_PARM_VIDEO_ROTATION = 5;
  public static final int XAN_CODEC_PARM_VOX_MODE = 15;
  public static final int XAN_DTMF_KEY_0 = 0;
  public static final int XAN_DTMF_KEY_1 = 1;
  public static final int XAN_DTMF_KEY_2 = 2;
  public static final int XAN_DTMF_KEY_3 = 3;
  public static final int XAN_DTMF_KEY_4 = 4;
  public static final int XAN_DTMF_KEY_5 = 5;
  public static final int XAN_DTMF_KEY_6 = 6;
  public static final int XAN_DTMF_KEY_7 = 7;
  public static final int XAN_DTMF_KEY_8 = 8;
  public static final int XAN_DTMF_KEY_9 = 9;
  public static final int XAN_DTMF_KEY_A = 12;
  public static final int XAN_DTMF_KEY_ASTERISK = 10;
  public static final int XAN_DTMF_KEY_B = 13;
  public static final int XAN_DTMF_KEY_C = 14;
  public static final int XAN_DTMF_KEY_D = 15;
  public static final int XAN_DTMF_KEY_FLASH = 16;
  public static final int XAN_DTMF_KEY_INVALID = -1;
  public static final int XAN_DTMF_KEY_MAX = 17;
  public static final int XAN_DTMF_KEY_POUND = 11;
  public static final int XAN_FAILURE = -1;
  public static final int XAN_FALSE = 0;
  public static final int XAN_SS_ERROR = -1;
  public static final int XAN_SS_OK = 0;
  public static final int XAN_SUCCESS = 0;
  public static final int XAN_TRUE = 1;
  public static final int XAN_VT_CALLSSNID_INVALID = -1;
  public static final int XAN_WOULDBLOCK = 1;

  public static class IM_MMContentType
  {
    public static final int IM_MM_CONTENT_TYPE_FILE = 2;
    public static final int IM_MM_CONTENT_TYPE_HTML = 1;
    public static final int IM_MM_CONTENT_TYPE_MAX = 3;
    public static final int IM_MM_CONTENT_TYPE_TEXT;
  }

  public static class ImsImCPIMType
  {
    public static final int IM_CPIM_IMAGE_BMP = 5;
    public static final int IM_CPIM_IMAGE_JPEG = 3;
    public static final int IM_CPIM_IMAGE_JPG = 4;
    public static final int IM_CPIM_INVALID = -1;
    public static final int IM_CPIM_MAX = 7;
    public static final int IM_CPIM_TEXT_FLASHCON = 1;
    public static final int IM_CPIM_TEXT_HTML = 6;
    public static final int IM_CPIM_TEXT_PLAIN = 0;
    public static final int IM_CPIM_TEXT_PLAIN_FLASHCON = 2;
  }
}

/* Location:           C:\Users\nigeluno\Desktop\APK2Java\tools\classes-dex2jar.jar
 * Qualified Name:     com.sec.android.ims.ImsConstants
 * JD-Core Version:    0.6.0
 */