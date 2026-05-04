package com.baicizhan.online.bcz_system_api;

import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.thrift.basic.SystemException;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.AsyncProcessFunction;
import org.apache.thrift.ProcessFunction;
import org.apache.thrift.TApplicationException;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseAsyncProcessor;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TBaseProcessor;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.TProcessor;
import org.apache.thrift.TServiceClient;
import org.apache.thrift.TServiceClientFactory;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.async.TAsyncClient;
import org.apache.thrift.async.TAsyncClientFactory;
import org.apache.thrift.async.TAsyncClientManager;
import org.apache.thrift.async.TAsyncMethodCall;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.MapMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
import org.apache.thrift.protocol.TMap;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.protocol.TStruct;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.server.AbstractNonblockingServer;
import org.apache.thrift.transport.TIOStreamTransport;
import org.apache.thrift.transport.TMemoryInputTransport;
import org.apache.thrift.transport.TNonblockingTransport;
import org.junit.jupiter.api.j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BczSystemApiService {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.BczSystemApiService$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_dict_new_version_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_dict_new_version_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_infos_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_infos_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_ireading_new_version_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_ireading_new_version_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_nav_tabs_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_nav_tabs_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_new_version_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_new_version_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_beta_update_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_beta_update_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_feedback_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_feedback_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_new_version_info_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_new_version_info_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_blacklist_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_blacklist_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_whitelist_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_whitelist_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_guide_for_new_strategy_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_guide_for_new_strategy_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_privacy_agreement_version_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_privacy_agreement_version_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_static_config_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_static_config_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_switches_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_switches_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_test_flags_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_test_flags_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$qrcode_scan_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$qrcode_scan_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_result$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_without_login_args$_Fields;
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_without_login_result$_Fields;

        static {
            int[] iArr = new int[get_app_feedback_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_feedback_info_result$_Fields = iArr;
            try {
                iArr[get_app_feedback_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_feedback_info_result$_Fields[get_app_feedback_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_feedback_info_result$_Fields[get_app_feedback_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_feedback_info_args$_Fields = new int[get_app_feedback_info_args._Fields.values().length];
            int[] iArr2 = new int[get_app_new_version_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_new_version_info_result$_Fields = iArr2;
            try {
                iArr2[get_app_new_version_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_new_version_info_result$_Fields[get_app_new_version_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_new_version_info_result$_Fields[get_app_new_version_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[get_app_new_version_info_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_new_version_info_args$_Fields = iArr3;
            try {
                iArr3[get_app_new_version_info_args._Fields.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[get_app_beta_update_info_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_beta_update_info_result$_Fields = iArr4;
            try {
                iArr4[get_app_beta_update_info_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_beta_update_info_result$_Fields[get_app_beta_update_info_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_beta_update_info_result$_Fields[get_app_beta_update_info_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr5 = new int[get_app_beta_update_info_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_beta_update_info_args$_Fields = iArr5;
            try {
                iArr5[get_app_beta_update_info_args._Fields.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr6 = new int[get_privacy_agreement_version_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_privacy_agreement_version_result$_Fields = iArr6;
            try {
                iArr6[get_privacy_agreement_version_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_privacy_agreement_version_result$_Fields[get_privacy_agreement_version_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_privacy_agreement_version_result$_Fields[get_privacy_agreement_version_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_privacy_agreement_version_args$_Fields = new int[get_privacy_agreement_version_args._Fields.values().length];
            int[] iArr7 = new int[qrcode_scan_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$qrcode_scan_result$_Fields = iArr7;
            try {
                iArr7[qrcode_scan_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$qrcode_scan_result$_Fields[qrcode_scan_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$qrcode_scan_result$_Fields[qrcode_scan_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr8 = new int[qrcode_scan_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$qrcode_scan_args$_Fields = iArr8;
            try {
                iArr8[qrcode_scan_args._Fields.QRCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr9 = new int[get_static_config_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_static_config_result$_Fields = iArr9;
            try {
                iArr9[get_static_config_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_static_config_result$_Fields[get_static_config_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_static_config_result$_Fields[get_static_config_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_static_config_args$_Fields = new int[get_static_config_args._Fields.values().length];
            int[] iArr10 = new int[get_test_flags_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_test_flags_result$_Fields = iArr10;
            try {
                iArr10[get_test_flags_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_test_flags_result$_Fields[get_test_flags_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_test_flags_result$_Fields[get_test_flags_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_test_flags_args$_Fields = new int[get_test_flags_args._Fields.values().length];
            int[] iArr11 = new int[get_guide_for_new_strategy_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_guide_for_new_strategy_result$_Fields = iArr11;
            try {
                iArr11[get_guide_for_new_strategy_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_guide_for_new_strategy_result$_Fields[get_guide_for_new_strategy_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_guide_for_new_strategy_result$_Fields[get_guide_for_new_strategy_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_guide_for_new_strategy_args$_Fields = new int[get_guide_for_new_strategy_args._Fields.values().length];
            int[] iArr12 = new int[report_event_without_login_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_without_login_result$_Fields = iArr12;
            try {
                iArr12[report_event_without_login_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_without_login_result$_Fields[report_event_without_login_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            int[] iArr13 = new int[report_event_without_login_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_without_login_args$_Fields = iArr13;
            try {
                iArr13[report_event_without_login_args._Fields.JSONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            int[] iArr14 = new int[report_event_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_result$_Fields = iArr14;
            try {
                iArr14[report_event_result._Fields.BOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_result$_Fields[report_event_result._Fields.BOMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            int[] iArr15 = new int[report_event_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_args$_Fields = iArr15;
            try {
                iArr15[report_event_args._Fields.JSONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            int[] iArr16 = new int[check_nav_tabs_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_nav_tabs_result$_Fields = iArr16;
            try {
                iArr16[check_nav_tabs_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_nav_tabs_result$_Fields[check_nav_tabs_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_nav_tabs_result$_Fields[check_nav_tabs_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused36) {
            }
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_nav_tabs_args$_Fields = new int[check_nav_tabs_args._Fields.values().length];
            int[] iArr17 = new int[get_switches_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_switches_result$_Fields = iArr17;
            try {
                iArr17[get_switches_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_switches_result$_Fields[get_switches_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_switches_result$_Fields[get_switches_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused39) {
            }
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_switches_args$_Fields = new int[get_switches_args._Fields.values().length];
            int[] iArr18 = new int[check_ireading_new_version_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_ireading_new_version_result$_Fields = iArr18;
            try {
                iArr18[check_ireading_new_version_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_ireading_new_version_result$_Fields[check_ireading_new_version_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_ireading_new_version_result$_Fields[check_ireading_new_version_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused42) {
            }
            int[] iArr19 = new int[check_ireading_new_version_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_ireading_new_version_args$_Fields = iArr19;
            try {
                iArr19[check_ireading_new_version_args._Fields.APP_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            int[] iArr20 = new int[check_dict_new_version_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_dict_new_version_result$_Fields = iArr20;
            try {
                iArr20[check_dict_new_version_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_dict_new_version_result$_Fields[check_dict_new_version_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_dict_new_version_result$_Fields[check_dict_new_version_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused46) {
            }
            int[] iArr21 = new int[check_dict_new_version_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_dict_new_version_args$_Fields = iArr21;
            try {
                iArr21[check_dict_new_version_args._Fields.APP_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            int[] iArr22 = new int[get_domain_whitelist_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_whitelist_result$_Fields = iArr22;
            try {
                iArr22[get_domain_whitelist_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_whitelist_result$_Fields[get_domain_whitelist_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_whitelist_result$_Fields[get_domain_whitelist_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused50) {
            }
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_whitelist_args$_Fields = new int[get_domain_whitelist_args._Fields.values().length];
            int[] iArr23 = new int[get_domain_blacklist_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_blacklist_result$_Fields = iArr23;
            try {
                iArr23[get_domain_blacklist_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_blacklist_result$_Fields[get_domain_blacklist_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_blacklist_result$_Fields[get_domain_blacklist_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused53) {
            }
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_blacklist_args$_Fields = new int[get_domain_blacklist_args._Fields.values().length];
            int[] iArr24 = new int[check_new_version_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_new_version_result$_Fields = iArr24;
            try {
                iArr24[check_new_version_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_new_version_result$_Fields[check_new_version_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_new_version_result$_Fields[check_new_version_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused56) {
            }
            int[] iArr25 = new int[check_new_version_args._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_new_version_args$_Fields = iArr25;
            try {
                iArr25[check_new_version_args._Fields.APP_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            int[] iArr26 = new int[check_infos_result._Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_infos_result$_Fields = iArr26;
            try {
                iArr26[check_infos_result._Fields.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_infos_result$_Fields[check_infos_result._Fields.BOOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_infos_result$_Fields[check_infos_result._Fields.BOMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused60) {
            }
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_infos_args$_Fields = new int[check_infos_args._Fields.values().length];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncClient extends TAsyncClient implements AsyncIface {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class Factory implements TAsyncClientFactory<AsyncClient> {
            private TAsyncClientManager clientManager;
            private TProtocolFactory protocolFactory;

            public Factory(TAsyncClientManager clientManager, TProtocolFactory protocolFactory) {
                this.clientManager = clientManager;
                this.protocolFactory = protocolFactory;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.async.TAsyncClientFactory
            public AsyncClient getAsyncClient(TNonblockingTransport transport) {
                return new AsyncClient(this.protocolFactory, this.clientManager, transport);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_dict_new_version_call extends TAsyncMethodCall {
            private BczAppInfo app_info;

            public check_dict_new_version_call(BczAppInfo app_info, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.app_info = app_info;
            }

            public BczVersionInfo getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_check_dict_new_version();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("check_dict_new_version", (byte) 1, 0));
                check_dict_new_version_args check_dict_new_version_argsVar = new check_dict_new_version_args();
                check_dict_new_version_argsVar.setApp_info(this.app_info);
                check_dict_new_version_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_infos_call extends TAsyncMethodCall {
            public check_infos_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public BczSystemInfos getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_check_infos();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("check_infos", (byte) 1, 0));
                new check_infos_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_ireading_new_version_call extends TAsyncMethodCall {
            private BczAppInfo app_info;

            public check_ireading_new_version_call(BczAppInfo app_info, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.app_info = app_info;
            }

            public BczVersionInfo getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_check_ireading_new_version();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("check_ireading_new_version", (byte) 1, 0));
                check_ireading_new_version_args check_ireading_new_version_argsVar = new check_ireading_new_version_args();
                check_ireading_new_version_argsVar.setApp_info(this.app_info);
                check_ireading_new_version_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_nav_tabs_call extends TAsyncMethodCall {
            public check_nav_tabs_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public BczNavTabs getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_check_nav_tabs();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("check_nav_tabs", (byte) 1, 0));
                new check_nav_tabs_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_new_version_call extends TAsyncMethodCall {
            private BczAppInfo app_info;

            public check_new_version_call(BczAppInfo app_info, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.app_info = app_info;
            }

            public BczVersionInfo getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_check_new_version();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("check_new_version", (byte) 1, 0));
                check_new_version_args check_new_version_argsVar = new check_new_version_args();
                check_new_version_argsVar.setApp_info(this.app_info);
                check_new_version_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_beta_update_info_call extends TAsyncMethodCall {
            private AppBetaUpdateRequest request;

            public get_app_beta_update_info_call(AppBetaUpdateRequest request, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.request = request;
            }

            public AppBetaUpdateResult getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_app_beta_update_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_app_beta_update_info", (byte) 1, 0));
                get_app_beta_update_info_args get_app_beta_update_info_argsVar = new get_app_beta_update_info_args();
                get_app_beta_update_info_argsVar.setRequest(this.request);
                get_app_beta_update_info_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_feedback_info_call extends TAsyncMethodCall {
            public get_app_feedback_info_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public Map<String, String> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_app_feedback_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_app_feedback_info", (byte) 1, 0));
                new get_app_feedback_info_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_new_version_info_call extends TAsyncMethodCall {
            private AppBetaUpdateRequest request;

            public get_app_new_version_info_call(AppBetaUpdateRequest request, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.request = request;
            }

            public AppNewVersionResult getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_app_new_version_info();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_app_new_version_info", (byte) 1, 0));
                get_app_new_version_info_args get_app_new_version_info_argsVar = new get_app_new_version_info_args();
                get_app_new_version_info_argsVar.setRequest(this.request);
                get_app_new_version_info_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_blacklist_call extends TAsyncMethodCall {
            public get_domain_blacklist_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public List<String> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_domain_blacklist();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_domain_blacklist", (byte) 1, 0));
                new get_domain_blacklist_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_whitelist_call extends TAsyncMethodCall {
            public get_domain_whitelist_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public List<String> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_domain_whitelist();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_domain_whitelist", (byte) 1, 0));
                new get_domain_whitelist_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_guide_for_new_strategy_call extends TAsyncMethodCall {
            public get_guide_for_new_strategy_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public GuideForNewStrategy getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_guide_for_new_strategy();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_guide_for_new_strategy", (byte) 1, 0));
                new get_guide_for_new_strategy_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_privacy_agreement_version_call extends TAsyncMethodCall {
            public get_privacy_agreement_version_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public PrivacyAgreementInfo getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_privacy_agreement_version();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_privacy_agreement_version", (byte) 1, 0));
                new get_privacy_agreement_version_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_static_config_call extends TAsyncMethodCall {
            public get_static_config_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public List<StaticConfig> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_static_config();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_static_config", (byte) 1, 0));
                new get_static_config_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_switches_call extends TAsyncMethodCall {
            public get_switches_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public BczAppSwitch getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_switches();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_switches", (byte) 1, 0));
                new get_switches_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_test_flags_call extends TAsyncMethodCall {
            public get_test_flags_call(AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
            }

            public Map<String, Integer> getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_get_test_flags();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("get_test_flags", (byte) 1, 0));
                new get_test_flags_args().write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_call extends TAsyncMethodCall {
            private String qrcode;

            public qrcode_scan_call(String qrcode, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.qrcode = qrcode;
            }

            public QRCodeResp getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                return new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_qrcode_scan();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("qrcode_scan", (byte) 1, 0));
                qrcode_scan_args qrcode_scan_argsVar = new qrcode_scan_args();
                qrcode_scan_argsVar.setQrcode(this.qrcode);
                qrcode_scan_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_call extends TAsyncMethodCall {
            private List<String> jsons;

            public report_event_call(List<String> jsons, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.jsons = jsons;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_report_event();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("report_event", (byte) 1, 0));
                report_event_args report_event_argsVar = new report_event_args();
                report_event_argsVar.setJsons(this.jsons);
                report_event_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_without_login_call extends TAsyncMethodCall {
            private List<String> jsons;

            public report_event_without_login_call(List<String> jsons, AsyncMethodCallback resultHandler, TAsyncClient client, TProtocolFactory protocolFactory, TNonblockingTransport transport) throws TException {
                super(client, protocolFactory, transport, resultHandler, false);
                this.jsons = jsons;
            }

            public void getResult() throws SystemException, LogicException, TException {
                if (getState() != TAsyncMethodCall.State.RESPONSE_READ) {
                    throw new IllegalStateException("Method call not finished!");
                }
                new Client(this.client.getProtocolFactory().getProtocol(new TMemoryInputTransport(getFrameBuffer().array()))).recv_report_event_without_login();
            }

            @Override // org.apache.thrift.async.TAsyncMethodCall
            public void write_args(TProtocol prot) throws TException {
                prot.writeMessageBegin(new TMessage("report_event_without_login", (byte) 1, 0));
                report_event_without_login_args report_event_without_login_argsVar = new report_event_without_login_args();
                report_event_without_login_argsVar.setJsons(this.jsons);
                report_event_without_login_argsVar.write(prot);
                prot.writeMessageEnd();
            }
        }

        public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
            super(protocolFactory, clientManager, transport);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void check_dict_new_version(BczAppInfo app_info, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            check_dict_new_version_call check_dict_new_version_callVar = new check_dict_new_version_call(app_info, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = check_dict_new_version_callVar;
            this.___manager.call(check_dict_new_version_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void check_infos(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            check_infos_call check_infos_callVar = new check_infos_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = check_infos_callVar;
            this.___manager.call(check_infos_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void check_ireading_new_version(BczAppInfo app_info, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            check_ireading_new_version_call check_ireading_new_version_callVar = new check_ireading_new_version_call(app_info, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = check_ireading_new_version_callVar;
            this.___manager.call(check_ireading_new_version_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void check_nav_tabs(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            check_nav_tabs_call check_nav_tabs_callVar = new check_nav_tabs_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = check_nav_tabs_callVar;
            this.___manager.call(check_nav_tabs_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void check_new_version(BczAppInfo app_info, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            check_new_version_call check_new_version_callVar = new check_new_version_call(app_info, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = check_new_version_callVar;
            this.___manager.call(check_new_version_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void get_app_beta_update_info(AppBetaUpdateRequest request, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_app_beta_update_info_call get_app_beta_update_info_callVar = new get_app_beta_update_info_call(request, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_app_beta_update_info_callVar;
            this.___manager.call(get_app_beta_update_info_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void get_app_feedback_info(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_app_feedback_info_call get_app_feedback_info_callVar = new get_app_feedback_info_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_app_feedback_info_callVar;
            this.___manager.call(get_app_feedback_info_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void get_app_new_version_info(AppBetaUpdateRequest request, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_app_new_version_info_call get_app_new_version_info_callVar = new get_app_new_version_info_call(request, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_app_new_version_info_callVar;
            this.___manager.call(get_app_new_version_info_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void get_domain_blacklist(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_domain_blacklist_call get_domain_blacklist_callVar = new get_domain_blacklist_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_domain_blacklist_callVar;
            this.___manager.call(get_domain_blacklist_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void get_domain_whitelist(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_domain_whitelist_call get_domain_whitelist_callVar = new get_domain_whitelist_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_domain_whitelist_callVar;
            this.___manager.call(get_domain_whitelist_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void get_guide_for_new_strategy(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_guide_for_new_strategy_call get_guide_for_new_strategy_callVar = new get_guide_for_new_strategy_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_guide_for_new_strategy_callVar;
            this.___manager.call(get_guide_for_new_strategy_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void get_privacy_agreement_version(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_privacy_agreement_version_call get_privacy_agreement_version_callVar = new get_privacy_agreement_version_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_privacy_agreement_version_callVar;
            this.___manager.call(get_privacy_agreement_version_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void get_static_config(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_static_config_call get_static_config_callVar = new get_static_config_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_static_config_callVar;
            this.___manager.call(get_static_config_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void get_switches(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_switches_call get_switches_callVar = new get_switches_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_switches_callVar;
            this.___manager.call(get_switches_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void get_test_flags(AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            get_test_flags_call get_test_flags_callVar = new get_test_flags_call(resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = get_test_flags_callVar;
            this.___manager.call(get_test_flags_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void qrcode_scan(String qrcode, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            qrcode_scan_call qrcode_scan_callVar = new qrcode_scan_call(qrcode, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = qrcode_scan_callVar;
            this.___manager.call(qrcode_scan_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void report_event(List<String> jsons, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            report_event_call report_event_callVar = new report_event_call(jsons, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = report_event_callVar;
            this.___manager.call(report_event_callVar);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncIface
        public void report_event_without_login(List<String> jsons, AsyncMethodCallback resultHandler) throws TException {
            checkReady();
            report_event_without_login_call report_event_without_login_callVar = new report_event_without_login_call(jsons, resultHandler, this, this.___protocolFactory, this.___transport);
            this.___currentMethod = report_event_without_login_callVar;
            this.___manager.call(report_event_without_login_callVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AsyncIface {
        void check_dict_new_version(BczAppInfo app_info, AsyncMethodCallback resultHandler) throws TException;

        void check_infos(AsyncMethodCallback resultHandler) throws TException;

        void check_ireading_new_version(BczAppInfo app_info, AsyncMethodCallback resultHandler) throws TException;

        void check_nav_tabs(AsyncMethodCallback resultHandler) throws TException;

        void check_new_version(BczAppInfo app_info, AsyncMethodCallback resultHandler) throws TException;

        void get_app_beta_update_info(AppBetaUpdateRequest request, AsyncMethodCallback resultHandler) throws TException;

        void get_app_feedback_info(AsyncMethodCallback resultHandler) throws TException;

        void get_app_new_version_info(AppBetaUpdateRequest request, AsyncMethodCallback resultHandler) throws TException;

        void get_domain_blacklist(AsyncMethodCallback resultHandler) throws TException;

        void get_domain_whitelist(AsyncMethodCallback resultHandler) throws TException;

        void get_guide_for_new_strategy(AsyncMethodCallback resultHandler) throws TException;

        void get_privacy_agreement_version(AsyncMethodCallback resultHandler) throws TException;

        void get_static_config(AsyncMethodCallback resultHandler) throws TException;

        void get_switches(AsyncMethodCallback resultHandler) throws TException;

        void get_test_flags(AsyncMethodCallback resultHandler) throws TException;

        void qrcode_scan(String qrcode, AsyncMethodCallback resultHandler) throws TException;

        void report_event(List<String> jsons, AsyncMethodCallback resultHandler) throws TException;

        void report_event_without_login(List<String> jsons, AsyncMethodCallback resultHandler) throws TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AsyncProcessor<I extends AsyncIface> extends TBaseAsyncProcessor<I> {
        private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_dict_new_version<I extends AsyncIface> extends AsyncProcessFunction<I, check_dict_new_version_args, BczVersionInfo> {
            public check_dict_new_version() {
                super("check_dict_new_version");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BczVersionInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BczVersionInfo>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.check_dict_new_version.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        check_dict_new_version_result check_dict_new_version_resultVar;
                        check_dict_new_version_result check_dict_new_version_resultVar2 = new check_dict_new_version_result();
                        try {
                            if (exc instanceof SystemException) {
                                check_dict_new_version_resultVar2.boom = (SystemException) exc;
                                check_dict_new_version_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    check_dict_new_version_resultVar = r02;
                                    this.sendResponse(fb2, check_dict_new_version_resultVar, b11, seqid);
                                    return;
                                }
                                check_dict_new_version_resultVar2.bomb = (LogicException) exc;
                                check_dict_new_version_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, check_dict_new_version_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        check_dict_new_version_resultVar = check_dict_new_version_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BczVersionInfo o11) {
                        check_dict_new_version_result check_dict_new_version_resultVar = new check_dict_new_version_result();
                        check_dict_new_version_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, check_dict_new_version_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public check_dict_new_version_args getEmptyArgsInstance() {
                return new check_dict_new_version_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, check_dict_new_version_args args, AsyncMethodCallback<BczVersionInfo> resultHandler) throws TException {
                iface.check_dict_new_version(args.app_info, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_infos<I extends AsyncIface> extends AsyncProcessFunction<I, check_infos_args, BczSystemInfos> {
            public check_infos() {
                super("check_infos");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BczSystemInfos> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BczSystemInfos>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.check_infos.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        check_infos_result check_infos_resultVar;
                        check_infos_result check_infos_resultVar2 = new check_infos_result();
                        try {
                            if (exc instanceof SystemException) {
                                check_infos_resultVar2.boom = (SystemException) exc;
                                check_infos_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    check_infos_resultVar = r02;
                                    this.sendResponse(fb2, check_infos_resultVar, b11, seqid);
                                    return;
                                }
                                check_infos_resultVar2.bomb = (LogicException) exc;
                                check_infos_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, check_infos_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        check_infos_resultVar = check_infos_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BczSystemInfos o11) {
                        check_infos_result check_infos_resultVar = new check_infos_result();
                        check_infos_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, check_infos_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public check_infos_args getEmptyArgsInstance() {
                return new check_infos_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, check_infos_args args, AsyncMethodCallback<BczSystemInfos> resultHandler) throws TException {
                iface.check_infos(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_ireading_new_version<I extends AsyncIface> extends AsyncProcessFunction<I, check_ireading_new_version_args, BczVersionInfo> {
            public check_ireading_new_version() {
                super("check_ireading_new_version");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BczVersionInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BczVersionInfo>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.check_ireading_new_version.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        check_ireading_new_version_result check_ireading_new_version_resultVar;
                        check_ireading_new_version_result check_ireading_new_version_resultVar2 = new check_ireading_new_version_result();
                        try {
                            if (exc instanceof SystemException) {
                                check_ireading_new_version_resultVar2.boom = (SystemException) exc;
                                check_ireading_new_version_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    check_ireading_new_version_resultVar = r02;
                                    this.sendResponse(fb2, check_ireading_new_version_resultVar, b11, seqid);
                                    return;
                                }
                                check_ireading_new_version_resultVar2.bomb = (LogicException) exc;
                                check_ireading_new_version_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, check_ireading_new_version_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        check_ireading_new_version_resultVar = check_ireading_new_version_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BczVersionInfo o11) {
                        check_ireading_new_version_result check_ireading_new_version_resultVar = new check_ireading_new_version_result();
                        check_ireading_new_version_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, check_ireading_new_version_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public check_ireading_new_version_args getEmptyArgsInstance() {
                return new check_ireading_new_version_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, check_ireading_new_version_args args, AsyncMethodCallback<BczVersionInfo> resultHandler) throws TException {
                iface.check_ireading_new_version(args.app_info, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_nav_tabs<I extends AsyncIface> extends AsyncProcessFunction<I, check_nav_tabs_args, BczNavTabs> {
            public check_nav_tabs() {
                super("check_nav_tabs");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BczNavTabs> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BczNavTabs>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.check_nav_tabs.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        check_nav_tabs_result check_nav_tabs_resultVar;
                        check_nav_tabs_result check_nav_tabs_resultVar2 = new check_nav_tabs_result();
                        try {
                            if (exc instanceof SystemException) {
                                check_nav_tabs_resultVar2.boom = (SystemException) exc;
                                check_nav_tabs_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    check_nav_tabs_resultVar = r02;
                                    this.sendResponse(fb2, check_nav_tabs_resultVar, b11, seqid);
                                    return;
                                }
                                check_nav_tabs_resultVar2.bomb = (LogicException) exc;
                                check_nav_tabs_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, check_nav_tabs_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        check_nav_tabs_resultVar = check_nav_tabs_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BczNavTabs o11) {
                        check_nav_tabs_result check_nav_tabs_resultVar = new check_nav_tabs_result();
                        check_nav_tabs_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, check_nav_tabs_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public check_nav_tabs_args getEmptyArgsInstance() {
                return new check_nav_tabs_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, check_nav_tabs_args args, AsyncMethodCallback<BczNavTabs> resultHandler) throws TException {
                iface.check_nav_tabs(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_new_version<I extends AsyncIface> extends AsyncProcessFunction<I, check_new_version_args, BczVersionInfo> {
            public check_new_version() {
                super("check_new_version");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BczVersionInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BczVersionInfo>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.check_new_version.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        check_new_version_result check_new_version_resultVar;
                        check_new_version_result check_new_version_resultVar2 = new check_new_version_result();
                        try {
                            if (exc instanceof SystemException) {
                                check_new_version_resultVar2.boom = (SystemException) exc;
                                check_new_version_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    check_new_version_resultVar = r02;
                                    this.sendResponse(fb2, check_new_version_resultVar, b11, seqid);
                                    return;
                                }
                                check_new_version_resultVar2.bomb = (LogicException) exc;
                                check_new_version_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, check_new_version_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        check_new_version_resultVar = check_new_version_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BczVersionInfo o11) {
                        check_new_version_result check_new_version_resultVar = new check_new_version_result();
                        check_new_version_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, check_new_version_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public check_new_version_args getEmptyArgsInstance() {
                return new check_new_version_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, check_new_version_args args, AsyncMethodCallback<BczVersionInfo> resultHandler) throws TException {
                iface.check_new_version(args.app_info, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_beta_update_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_app_beta_update_info_args, AppBetaUpdateResult> {
            public get_app_beta_update_info() {
                super("get_app_beta_update_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<AppBetaUpdateResult> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<AppBetaUpdateResult>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.get_app_beta_update_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_app_beta_update_info_result get_app_beta_update_info_resultVar;
                        get_app_beta_update_info_result get_app_beta_update_info_resultVar2 = new get_app_beta_update_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_app_beta_update_info_resultVar2.boom = (SystemException) exc;
                                get_app_beta_update_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_app_beta_update_info_resultVar = r02;
                                    this.sendResponse(fb2, get_app_beta_update_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_app_beta_update_info_resultVar2.bomb = (LogicException) exc;
                                get_app_beta_update_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_app_beta_update_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_app_beta_update_info_resultVar = get_app_beta_update_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(AppBetaUpdateResult o11) {
                        get_app_beta_update_info_result get_app_beta_update_info_resultVar = new get_app_beta_update_info_result();
                        get_app_beta_update_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_app_beta_update_info_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_app_beta_update_info_args getEmptyArgsInstance() {
                return new get_app_beta_update_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_app_beta_update_info_args args, AsyncMethodCallback<AppBetaUpdateResult> resultHandler) throws TException {
                iface.get_app_beta_update_info(args.request, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_feedback_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_app_feedback_info_args, Map<String, String>> {
            public get_app_feedback_info() {
                super("get_app_feedback_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Map<String, String>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Map<String, String>>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.get_app_feedback_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_app_feedback_info_result get_app_feedback_info_resultVar;
                        get_app_feedback_info_result get_app_feedback_info_resultVar2 = new get_app_feedback_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_app_feedback_info_resultVar2.boom = (SystemException) exc;
                                get_app_feedback_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_app_feedback_info_resultVar = r02;
                                    this.sendResponse(fb2, get_app_feedback_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_app_feedback_info_resultVar2.bomb = (LogicException) exc;
                                get_app_feedback_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_app_feedback_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_app_feedback_info_resultVar = get_app_feedback_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Map<String, String> o11) {
                        get_app_feedback_info_result get_app_feedback_info_resultVar = new get_app_feedback_info_result();
                        get_app_feedback_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_app_feedback_info_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_app_feedback_info_args getEmptyArgsInstance() {
                return new get_app_feedback_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_app_feedback_info_args args, AsyncMethodCallback<Map<String, String>> resultHandler) throws TException {
                iface.get_app_feedback_info(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_new_version_info<I extends AsyncIface> extends AsyncProcessFunction<I, get_app_new_version_info_args, AppNewVersionResult> {
            public get_app_new_version_info() {
                super("get_app_new_version_info");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<AppNewVersionResult> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<AppNewVersionResult>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.get_app_new_version_info.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_app_new_version_info_result get_app_new_version_info_resultVar;
                        get_app_new_version_info_result get_app_new_version_info_resultVar2 = new get_app_new_version_info_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_app_new_version_info_resultVar2.boom = (SystemException) exc;
                                get_app_new_version_info_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_app_new_version_info_resultVar = r02;
                                    this.sendResponse(fb2, get_app_new_version_info_resultVar, b11, seqid);
                                    return;
                                }
                                get_app_new_version_info_resultVar2.bomb = (LogicException) exc;
                                get_app_new_version_info_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_app_new_version_info_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_app_new_version_info_resultVar = get_app_new_version_info_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(AppNewVersionResult o11) {
                        get_app_new_version_info_result get_app_new_version_info_resultVar = new get_app_new_version_info_result();
                        get_app_new_version_info_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_app_new_version_info_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_app_new_version_info_args getEmptyArgsInstance() {
                return new get_app_new_version_info_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_app_new_version_info_args args, AsyncMethodCallback<AppNewVersionResult> resultHandler) throws TException {
                iface.get_app_new_version_info(args.request, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_blacklist<I extends AsyncIface> extends AsyncProcessFunction<I, get_domain_blacklist_args, List<String>> {
            public get_domain_blacklist() {
                super("get_domain_blacklist");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<String>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<String>>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.get_domain_blacklist.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_domain_blacklist_result get_domain_blacklist_resultVar;
                        get_domain_blacklist_result get_domain_blacklist_resultVar2 = new get_domain_blacklist_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_domain_blacklist_resultVar2.boom = (SystemException) exc;
                                get_domain_blacklist_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_domain_blacklist_resultVar = r02;
                                    this.sendResponse(fb2, get_domain_blacklist_resultVar, b11, seqid);
                                    return;
                                }
                                get_domain_blacklist_resultVar2.bomb = (LogicException) exc;
                                get_domain_blacklist_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_domain_blacklist_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_domain_blacklist_resultVar = get_domain_blacklist_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<String> o11) {
                        get_domain_blacklist_result get_domain_blacklist_resultVar = new get_domain_blacklist_result();
                        get_domain_blacklist_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_domain_blacklist_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_domain_blacklist_args getEmptyArgsInstance() {
                return new get_domain_blacklist_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_domain_blacklist_args args, AsyncMethodCallback<List<String>> resultHandler) throws TException {
                iface.get_domain_blacklist(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_whitelist<I extends AsyncIface> extends AsyncProcessFunction<I, get_domain_whitelist_args, List<String>> {
            public get_domain_whitelist() {
                super("get_domain_whitelist");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<String>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<String>>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.get_domain_whitelist.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_domain_whitelist_result get_domain_whitelist_resultVar;
                        get_domain_whitelist_result get_domain_whitelist_resultVar2 = new get_domain_whitelist_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_domain_whitelist_resultVar2.boom = (SystemException) exc;
                                get_domain_whitelist_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_domain_whitelist_resultVar = r02;
                                    this.sendResponse(fb2, get_domain_whitelist_resultVar, b11, seqid);
                                    return;
                                }
                                get_domain_whitelist_resultVar2.bomb = (LogicException) exc;
                                get_domain_whitelist_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_domain_whitelist_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_domain_whitelist_resultVar = get_domain_whitelist_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<String> o11) {
                        get_domain_whitelist_result get_domain_whitelist_resultVar = new get_domain_whitelist_result();
                        get_domain_whitelist_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_domain_whitelist_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_domain_whitelist_args getEmptyArgsInstance() {
                return new get_domain_whitelist_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_domain_whitelist_args args, AsyncMethodCallback<List<String>> resultHandler) throws TException {
                iface.get_domain_whitelist(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_guide_for_new_strategy<I extends AsyncIface> extends AsyncProcessFunction<I, get_guide_for_new_strategy_args, GuideForNewStrategy> {
            public get_guide_for_new_strategy() {
                super("get_guide_for_new_strategy");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<GuideForNewStrategy> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<GuideForNewStrategy>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.get_guide_for_new_strategy.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_guide_for_new_strategy_result get_guide_for_new_strategy_resultVar;
                        get_guide_for_new_strategy_result get_guide_for_new_strategy_resultVar2 = new get_guide_for_new_strategy_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_guide_for_new_strategy_resultVar2.boom = (SystemException) exc;
                                get_guide_for_new_strategy_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_guide_for_new_strategy_resultVar = r02;
                                    this.sendResponse(fb2, get_guide_for_new_strategy_resultVar, b11, seqid);
                                    return;
                                }
                                get_guide_for_new_strategy_resultVar2.bomb = (LogicException) exc;
                                get_guide_for_new_strategy_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_guide_for_new_strategy_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_guide_for_new_strategy_resultVar = get_guide_for_new_strategy_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(GuideForNewStrategy o11) {
                        get_guide_for_new_strategy_result get_guide_for_new_strategy_resultVar = new get_guide_for_new_strategy_result();
                        get_guide_for_new_strategy_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_guide_for_new_strategy_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_guide_for_new_strategy_args getEmptyArgsInstance() {
                return new get_guide_for_new_strategy_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_guide_for_new_strategy_args args, AsyncMethodCallback<GuideForNewStrategy> resultHandler) throws TException {
                iface.get_guide_for_new_strategy(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_privacy_agreement_version<I extends AsyncIface> extends AsyncProcessFunction<I, get_privacy_agreement_version_args, PrivacyAgreementInfo> {
            public get_privacy_agreement_version() {
                super("get_privacy_agreement_version");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<PrivacyAgreementInfo> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<PrivacyAgreementInfo>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.get_privacy_agreement_version.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_privacy_agreement_version_result get_privacy_agreement_version_resultVar;
                        get_privacy_agreement_version_result get_privacy_agreement_version_resultVar2 = new get_privacy_agreement_version_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_privacy_agreement_version_resultVar2.boom = (SystemException) exc;
                                get_privacy_agreement_version_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_privacy_agreement_version_resultVar = r02;
                                    this.sendResponse(fb2, get_privacy_agreement_version_resultVar, b11, seqid);
                                    return;
                                }
                                get_privacy_agreement_version_resultVar2.bomb = (LogicException) exc;
                                get_privacy_agreement_version_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_privacy_agreement_version_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_privacy_agreement_version_resultVar = get_privacy_agreement_version_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(PrivacyAgreementInfo o11) {
                        get_privacy_agreement_version_result get_privacy_agreement_version_resultVar = new get_privacy_agreement_version_result();
                        get_privacy_agreement_version_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_privacy_agreement_version_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_privacy_agreement_version_args getEmptyArgsInstance() {
                return new get_privacy_agreement_version_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_privacy_agreement_version_args args, AsyncMethodCallback<PrivacyAgreementInfo> resultHandler) throws TException {
                iface.get_privacy_agreement_version(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_static_config<I extends AsyncIface> extends AsyncProcessFunction<I, get_static_config_args, List<StaticConfig>> {
            public get_static_config() {
                super("get_static_config");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<List<StaticConfig>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<List<StaticConfig>>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.get_static_config.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_static_config_result get_static_config_resultVar;
                        get_static_config_result get_static_config_resultVar2 = new get_static_config_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_static_config_resultVar2.boom = (SystemException) exc;
                                get_static_config_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_static_config_resultVar = r02;
                                    this.sendResponse(fb2, get_static_config_resultVar, b11, seqid);
                                    return;
                                }
                                get_static_config_resultVar2.bomb = (LogicException) exc;
                                get_static_config_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_static_config_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_static_config_resultVar = get_static_config_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(List<StaticConfig> o11) {
                        get_static_config_result get_static_config_resultVar = new get_static_config_result();
                        get_static_config_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_static_config_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_static_config_args getEmptyArgsInstance() {
                return new get_static_config_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_static_config_args args, AsyncMethodCallback<List<StaticConfig>> resultHandler) throws TException {
                iface.get_static_config(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_switches<I extends AsyncIface> extends AsyncProcessFunction<I, get_switches_args, BczAppSwitch> {
            public get_switches() {
                super("get_switches");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<BczAppSwitch> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<BczAppSwitch>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.get_switches.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_switches_result get_switches_resultVar;
                        get_switches_result get_switches_resultVar2 = new get_switches_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_switches_resultVar2.boom = (SystemException) exc;
                                get_switches_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_switches_resultVar = r02;
                                    this.sendResponse(fb2, get_switches_resultVar, b11, seqid);
                                    return;
                                }
                                get_switches_resultVar2.bomb = (LogicException) exc;
                                get_switches_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_switches_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_switches_resultVar = get_switches_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(BczAppSwitch o11) {
                        get_switches_result get_switches_resultVar = new get_switches_result();
                        get_switches_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_switches_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_switches_args getEmptyArgsInstance() {
                return new get_switches_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_switches_args args, AsyncMethodCallback<BczAppSwitch> resultHandler) throws TException {
                iface.get_switches(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_test_flags<I extends AsyncIface> extends AsyncProcessFunction<I, get_test_flags_args, Map<String, Integer>> {
            public get_test_flags() {
                super("get_test_flags");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Map<String, Integer>> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Map<String, Integer>>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.get_test_flags.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        get_test_flags_result get_test_flags_resultVar;
                        get_test_flags_result get_test_flags_resultVar2 = new get_test_flags_result();
                        try {
                            if (exc instanceof SystemException) {
                                get_test_flags_resultVar2.boom = (SystemException) exc;
                                get_test_flags_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    get_test_flags_resultVar = r02;
                                    this.sendResponse(fb2, get_test_flags_resultVar, b11, seqid);
                                    return;
                                }
                                get_test_flags_resultVar2.bomb = (LogicException) exc;
                                get_test_flags_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, get_test_flags_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        get_test_flags_resultVar = get_test_flags_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Map<String, Integer> o11) {
                        get_test_flags_result get_test_flags_resultVar = new get_test_flags_result();
                        get_test_flags_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, get_test_flags_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public get_test_flags_args getEmptyArgsInstance() {
                return new get_test_flags_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, get_test_flags_args args, AsyncMethodCallback<Map<String, Integer>> resultHandler) throws TException {
                iface.get_test_flags(resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan<I extends AsyncIface> extends AsyncProcessFunction<I, qrcode_scan_args, QRCodeResp> {
            public qrcode_scan() {
                super("qrcode_scan");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<QRCodeResp> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<QRCodeResp>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.qrcode_scan.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        qrcode_scan_result qrcode_scan_resultVar;
                        qrcode_scan_result qrcode_scan_resultVar2 = new qrcode_scan_result();
                        try {
                            if (exc instanceof SystemException) {
                                qrcode_scan_resultVar2.boom = (SystemException) exc;
                                qrcode_scan_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    qrcode_scan_resultVar = r02;
                                    this.sendResponse(fb2, qrcode_scan_resultVar, b11, seqid);
                                    return;
                                }
                                qrcode_scan_resultVar2.bomb = (LogicException) exc;
                                qrcode_scan_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, qrcode_scan_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        qrcode_scan_resultVar = qrcode_scan_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(QRCodeResp o11) {
                        qrcode_scan_result qrcode_scan_resultVar = new qrcode_scan_result();
                        qrcode_scan_resultVar.success = o11;
                        try {
                            this.sendResponse(fb2, qrcode_scan_resultVar, (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public qrcode_scan_args getEmptyArgsInstance() {
                return new qrcode_scan_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, qrcode_scan_args args, AsyncMethodCallback<QRCodeResp> resultHandler) throws TException {
                iface.qrcode_scan(args.qrcode, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event<I extends AsyncIface> extends AsyncProcessFunction<I, report_event_args, Void> {
            public report_event() {
                super("report_event");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.report_event.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        report_event_result report_event_resultVar;
                        report_event_result report_event_resultVar2 = new report_event_result();
                        try {
                            if (exc instanceof SystemException) {
                                report_event_resultVar2.boom = (SystemException) exc;
                                report_event_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    report_event_resultVar = r02;
                                    this.sendResponse(fb2, report_event_resultVar, b11, seqid);
                                    return;
                                }
                                report_event_resultVar2.bomb = (LogicException) exc;
                                report_event_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, report_event_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        report_event_resultVar = report_event_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new report_event_result(), (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public report_event_args getEmptyArgsInstance() {
                return new report_event_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, report_event_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.report_event(args.jsons, resultHandler);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_without_login<I extends AsyncIface> extends AsyncProcessFunction<I, report_event_without_login_args, Void> {
            public report_event_without_login() {
                super("report_event_without_login");
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public AsyncMethodCallback<Void> getResultHandler(final AbstractNonblockingServer.AsyncFrameBuffer fb2, final int seqid) {
                return new AsyncMethodCallback<Void>() { // from class: com.baicizhan.online.bcz_system_api.BczSystemApiService.AsyncProcessor.report_event_without_login.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [org.apache.thrift.TBase] */
                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onError(Exception exc) {
                        byte b11;
                        report_event_without_login_result report_event_without_login_resultVar;
                        report_event_without_login_result report_event_without_login_resultVar2 = new report_event_without_login_result();
                        try {
                            if (exc instanceof SystemException) {
                                report_event_without_login_resultVar2.boom = (SystemException) exc;
                                report_event_without_login_resultVar2.setBoomIsSet(true);
                            } else {
                                if (!(exc instanceof LogicException)) {
                                    ?? r02 = (TBase) new TApplicationException(6, exc.getMessage());
                                    b11 = 3;
                                    report_event_without_login_resultVar = r02;
                                    this.sendResponse(fb2, report_event_without_login_resultVar, b11, seqid);
                                    return;
                                }
                                report_event_without_login_resultVar2.bomb = (LogicException) exc;
                                report_event_without_login_resultVar2.setBombIsSet(true);
                            }
                            this.sendResponse(fb2, report_event_without_login_resultVar, b11, seqid);
                            return;
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                            return;
                        }
                        b11 = 2;
                        report_event_without_login_resultVar = report_event_without_login_resultVar2;
                    }

                    @Override // org.apache.thrift.async.AsyncMethodCallback
                    public void onComplete(Void o11) {
                        try {
                            this.sendResponse(fb2, new report_event_without_login_result(), (byte) 2, seqid);
                        } catch (Exception e11) {
                            AsyncProcessor.LOGGER.error("Exception writing to internal frame buffer", (Throwable) e11);
                            fb2.close();
                        }
                    }
                };
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.AsyncProcessFunction
            public report_event_without_login_args getEmptyArgsInstance() {
                return new report_event_without_login_args();
            }

            @Override // org.apache.thrift.AsyncProcessFunction
            public void start(I iface, report_event_without_login_args args, AsyncMethodCallback<Void> resultHandler) throws TException {
                iface.report_event_without_login(args.jsons, resultHandler);
            }
        }

        public AsyncProcessor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends AsyncIface> Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMap(Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            processMap.put("check_infos", new check_infos());
            processMap.put("check_new_version", new check_new_version());
            processMap.put("get_domain_blacklist", new get_domain_blacklist());
            processMap.put("get_domain_whitelist", new get_domain_whitelist());
            processMap.put("check_dict_new_version", new check_dict_new_version());
            processMap.put("check_ireading_new_version", new check_ireading_new_version());
            processMap.put("get_switches", new get_switches());
            processMap.put("check_nav_tabs", new check_nav_tabs());
            processMap.put("report_event", new report_event());
            processMap.put("report_event_without_login", new report_event_without_login());
            processMap.put("get_guide_for_new_strategy", new get_guide_for_new_strategy());
            processMap.put("get_test_flags", new get_test_flags());
            processMap.put("get_static_config", new get_static_config());
            processMap.put("qrcode_scan", new qrcode_scan());
            processMap.put("get_privacy_agreement_version", new get_privacy_agreement_version());
            processMap.put("get_app_beta_update_info", new get_app_beta_update_info());
            processMap.put("get_app_new_version_info", new get_app_new_version_info());
            processMap.put("get_app_feedback_info", new get_app_feedback_info());
            return processMap;
        }

        public AsyncProcessor(I iface, Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Client extends TServiceClient implements Iface {
        public Client(TProtocol prot) {
            super(prot, prot);
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public BczVersionInfo check_dict_new_version(BczAppInfo app_info) throws SystemException, LogicException, TException {
            send_check_dict_new_version(app_info);
            return recv_check_dict_new_version();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public BczSystemInfos check_infos() throws SystemException, LogicException, TException {
            send_check_infos();
            return recv_check_infos();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public BczVersionInfo check_ireading_new_version(BczAppInfo app_info) throws SystemException, LogicException, TException {
            send_check_ireading_new_version(app_info);
            return recv_check_ireading_new_version();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public BczNavTabs check_nav_tabs() throws SystemException, LogicException, TException {
            send_check_nav_tabs();
            return recv_check_nav_tabs();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public BczVersionInfo check_new_version(BczAppInfo app_info) throws SystemException, LogicException, TException {
            send_check_new_version(app_info);
            return recv_check_new_version();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public AppBetaUpdateResult get_app_beta_update_info(AppBetaUpdateRequest request) throws SystemException, LogicException, TException {
            send_get_app_beta_update_info(request);
            return recv_get_app_beta_update_info();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public Map<String, String> get_app_feedback_info() throws SystemException, LogicException, TException {
            send_get_app_feedback_info();
            return recv_get_app_feedback_info();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public AppNewVersionResult get_app_new_version_info(AppBetaUpdateRequest request) throws SystemException, LogicException, TException {
            send_get_app_new_version_info(request);
            return recv_get_app_new_version_info();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public List<String> get_domain_blacklist() throws SystemException, LogicException, TException {
            send_get_domain_blacklist();
            return recv_get_domain_blacklist();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public List<String> get_domain_whitelist() throws SystemException, LogicException, TException {
            send_get_domain_whitelist();
            return recv_get_domain_whitelist();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public GuideForNewStrategy get_guide_for_new_strategy() throws SystemException, LogicException, TException {
            send_get_guide_for_new_strategy();
            return recv_get_guide_for_new_strategy();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public PrivacyAgreementInfo get_privacy_agreement_version() throws SystemException, LogicException, TException {
            send_get_privacy_agreement_version();
            return recv_get_privacy_agreement_version();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public List<StaticConfig> get_static_config() throws SystemException, LogicException, TException {
            send_get_static_config();
            return recv_get_static_config();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public BczAppSwitch get_switches() throws SystemException, LogicException, TException {
            send_get_switches();
            return recv_get_switches();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public Map<String, Integer> get_test_flags() throws SystemException, LogicException, TException {
            send_get_test_flags();
            return recv_get_test_flags();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public QRCodeResp qrcode_scan(String qrcode) throws SystemException, LogicException, TException {
            send_qrcode_scan(qrcode);
            return recv_qrcode_scan();
        }

        public BczVersionInfo recv_check_dict_new_version() throws SystemException, LogicException, TException {
            check_dict_new_version_result check_dict_new_version_resultVar = new check_dict_new_version_result();
            receiveBase(check_dict_new_version_resultVar, "check_dict_new_version");
            if (check_dict_new_version_resultVar.isSetSuccess()) {
                return check_dict_new_version_resultVar.success;
            }
            SystemException systemException = check_dict_new_version_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = check_dict_new_version_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "check_dict_new_version failed: unknown result");
        }

        public BczSystemInfos recv_check_infos() throws SystemException, LogicException, TException {
            check_infos_result check_infos_resultVar = new check_infos_result();
            receiveBase(check_infos_resultVar, "check_infos");
            if (check_infos_resultVar.isSetSuccess()) {
                return check_infos_resultVar.success;
            }
            SystemException systemException = check_infos_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = check_infos_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "check_infos failed: unknown result");
        }

        public BczVersionInfo recv_check_ireading_new_version() throws SystemException, LogicException, TException {
            check_ireading_new_version_result check_ireading_new_version_resultVar = new check_ireading_new_version_result();
            receiveBase(check_ireading_new_version_resultVar, "check_ireading_new_version");
            if (check_ireading_new_version_resultVar.isSetSuccess()) {
                return check_ireading_new_version_resultVar.success;
            }
            SystemException systemException = check_ireading_new_version_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = check_ireading_new_version_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "check_ireading_new_version failed: unknown result");
        }

        public BczNavTabs recv_check_nav_tabs() throws SystemException, LogicException, TException {
            check_nav_tabs_result check_nav_tabs_resultVar = new check_nav_tabs_result();
            receiveBase(check_nav_tabs_resultVar, "check_nav_tabs");
            if (check_nav_tabs_resultVar.isSetSuccess()) {
                return check_nav_tabs_resultVar.success;
            }
            SystemException systemException = check_nav_tabs_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = check_nav_tabs_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "check_nav_tabs failed: unknown result");
        }

        public BczVersionInfo recv_check_new_version() throws SystemException, LogicException, TException {
            check_new_version_result check_new_version_resultVar = new check_new_version_result();
            receiveBase(check_new_version_resultVar, "check_new_version");
            if (check_new_version_resultVar.isSetSuccess()) {
                return check_new_version_resultVar.success;
            }
            SystemException systemException = check_new_version_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = check_new_version_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "check_new_version failed: unknown result");
        }

        public AppBetaUpdateResult recv_get_app_beta_update_info() throws SystemException, LogicException, TException {
            get_app_beta_update_info_result get_app_beta_update_info_resultVar = new get_app_beta_update_info_result();
            receiveBase(get_app_beta_update_info_resultVar, "get_app_beta_update_info");
            if (get_app_beta_update_info_resultVar.isSetSuccess()) {
                return get_app_beta_update_info_resultVar.success;
            }
            SystemException systemException = get_app_beta_update_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_app_beta_update_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_app_beta_update_info failed: unknown result");
        }

        public Map<String, String> recv_get_app_feedback_info() throws SystemException, LogicException, TException {
            get_app_feedback_info_result get_app_feedback_info_resultVar = new get_app_feedback_info_result();
            receiveBase(get_app_feedback_info_resultVar, "get_app_feedback_info");
            if (get_app_feedback_info_resultVar.isSetSuccess()) {
                return get_app_feedback_info_resultVar.success;
            }
            SystemException systemException = get_app_feedback_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_app_feedback_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_app_feedback_info failed: unknown result");
        }

        public AppNewVersionResult recv_get_app_new_version_info() throws SystemException, LogicException, TException {
            get_app_new_version_info_result get_app_new_version_info_resultVar = new get_app_new_version_info_result();
            receiveBase(get_app_new_version_info_resultVar, "get_app_new_version_info");
            if (get_app_new_version_info_resultVar.isSetSuccess()) {
                return get_app_new_version_info_resultVar.success;
            }
            SystemException systemException = get_app_new_version_info_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_app_new_version_info_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_app_new_version_info failed: unknown result");
        }

        public List<String> recv_get_domain_blacklist() throws SystemException, LogicException, TException {
            get_domain_blacklist_result get_domain_blacklist_resultVar = new get_domain_blacklist_result();
            receiveBase(get_domain_blacklist_resultVar, "get_domain_blacklist");
            if (get_domain_blacklist_resultVar.isSetSuccess()) {
                return get_domain_blacklist_resultVar.success;
            }
            SystemException systemException = get_domain_blacklist_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_domain_blacklist_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_domain_blacklist failed: unknown result");
        }

        public List<String> recv_get_domain_whitelist() throws SystemException, LogicException, TException {
            get_domain_whitelist_result get_domain_whitelist_resultVar = new get_domain_whitelist_result();
            receiveBase(get_domain_whitelist_resultVar, "get_domain_whitelist");
            if (get_domain_whitelist_resultVar.isSetSuccess()) {
                return get_domain_whitelist_resultVar.success;
            }
            SystemException systemException = get_domain_whitelist_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_domain_whitelist_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_domain_whitelist failed: unknown result");
        }

        public GuideForNewStrategy recv_get_guide_for_new_strategy() throws SystemException, LogicException, TException {
            get_guide_for_new_strategy_result get_guide_for_new_strategy_resultVar = new get_guide_for_new_strategy_result();
            receiveBase(get_guide_for_new_strategy_resultVar, "get_guide_for_new_strategy");
            if (get_guide_for_new_strategy_resultVar.isSetSuccess()) {
                return get_guide_for_new_strategy_resultVar.success;
            }
            SystemException systemException = get_guide_for_new_strategy_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_guide_for_new_strategy_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_guide_for_new_strategy failed: unknown result");
        }

        public PrivacyAgreementInfo recv_get_privacy_agreement_version() throws SystemException, LogicException, TException {
            get_privacy_agreement_version_result get_privacy_agreement_version_resultVar = new get_privacy_agreement_version_result();
            receiveBase(get_privacy_agreement_version_resultVar, "get_privacy_agreement_version");
            if (get_privacy_agreement_version_resultVar.isSetSuccess()) {
                return get_privacy_agreement_version_resultVar.success;
            }
            SystemException systemException = get_privacy_agreement_version_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_privacy_agreement_version_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_privacy_agreement_version failed: unknown result");
        }

        public List<StaticConfig> recv_get_static_config() throws SystemException, LogicException, TException {
            get_static_config_result get_static_config_resultVar = new get_static_config_result();
            receiveBase(get_static_config_resultVar, "get_static_config");
            if (get_static_config_resultVar.isSetSuccess()) {
                return get_static_config_resultVar.success;
            }
            SystemException systemException = get_static_config_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_static_config_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_static_config failed: unknown result");
        }

        public BczAppSwitch recv_get_switches() throws SystemException, LogicException, TException {
            get_switches_result get_switches_resultVar = new get_switches_result();
            receiveBase(get_switches_resultVar, "get_switches");
            if (get_switches_resultVar.isSetSuccess()) {
                return get_switches_resultVar.success;
            }
            SystemException systemException = get_switches_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_switches_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_switches failed: unknown result");
        }

        public Map<String, Integer> recv_get_test_flags() throws SystemException, LogicException, TException {
            get_test_flags_result get_test_flags_resultVar = new get_test_flags_result();
            receiveBase(get_test_flags_resultVar, "get_test_flags");
            if (get_test_flags_resultVar.isSetSuccess()) {
                return get_test_flags_resultVar.success;
            }
            SystemException systemException = get_test_flags_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = get_test_flags_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "get_test_flags failed: unknown result");
        }

        public QRCodeResp recv_qrcode_scan() throws SystemException, LogicException, TException {
            qrcode_scan_result qrcode_scan_resultVar = new qrcode_scan_result();
            receiveBase(qrcode_scan_resultVar, "qrcode_scan");
            if (qrcode_scan_resultVar.isSetSuccess()) {
                return qrcode_scan_resultVar.success;
            }
            SystemException systemException = qrcode_scan_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = qrcode_scan_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
            throw new TApplicationException(5, "qrcode_scan failed: unknown result");
        }

        public void recv_report_event() throws SystemException, LogicException, TException {
            report_event_result report_event_resultVar = new report_event_result();
            receiveBase(report_event_resultVar, "report_event");
            SystemException systemException = report_event_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = report_event_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        public void recv_report_event_without_login() throws SystemException, LogicException, TException {
            report_event_without_login_result report_event_without_login_resultVar = new report_event_without_login_result();
            receiveBase(report_event_without_login_resultVar, "report_event_without_login");
            SystemException systemException = report_event_without_login_resultVar.boom;
            if (systemException != null) {
                throw systemException;
            }
            LogicException logicException = report_event_without_login_resultVar.bomb;
            if (logicException != null) {
                throw logicException;
            }
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public void report_event(List<String> jsons) throws SystemException, LogicException, TException {
            send_report_event(jsons);
            recv_report_event();
        }

        @Override // com.baicizhan.online.bcz_system_api.BczSystemApiService.Iface
        public void report_event_without_login(List<String> jsons) throws SystemException, LogicException, TException {
            send_report_event_without_login(jsons);
            recv_report_event_without_login();
        }

        public void send_check_dict_new_version(BczAppInfo app_info) throws TException {
            check_dict_new_version_args check_dict_new_version_argsVar = new check_dict_new_version_args();
            check_dict_new_version_argsVar.setApp_info(app_info);
            sendBase("check_dict_new_version", check_dict_new_version_argsVar);
        }

        public void send_check_infos() throws TException {
            sendBase("check_infos", new check_infos_args());
        }

        public void send_check_ireading_new_version(BczAppInfo app_info) throws TException {
            check_ireading_new_version_args check_ireading_new_version_argsVar = new check_ireading_new_version_args();
            check_ireading_new_version_argsVar.setApp_info(app_info);
            sendBase("check_ireading_new_version", check_ireading_new_version_argsVar);
        }

        public void send_check_nav_tabs() throws TException {
            sendBase("check_nav_tabs", new check_nav_tabs_args());
        }

        public void send_check_new_version(BczAppInfo app_info) throws TException {
            check_new_version_args check_new_version_argsVar = new check_new_version_args();
            check_new_version_argsVar.setApp_info(app_info);
            sendBase("check_new_version", check_new_version_argsVar);
        }

        public void send_get_app_beta_update_info(AppBetaUpdateRequest request) throws TException {
            get_app_beta_update_info_args get_app_beta_update_info_argsVar = new get_app_beta_update_info_args();
            get_app_beta_update_info_argsVar.setRequest(request);
            sendBase("get_app_beta_update_info", get_app_beta_update_info_argsVar);
        }

        public void send_get_app_feedback_info() throws TException {
            sendBase("get_app_feedback_info", new get_app_feedback_info_args());
        }

        public void send_get_app_new_version_info(AppBetaUpdateRequest request) throws TException {
            get_app_new_version_info_args get_app_new_version_info_argsVar = new get_app_new_version_info_args();
            get_app_new_version_info_argsVar.setRequest(request);
            sendBase("get_app_new_version_info", get_app_new_version_info_argsVar);
        }

        public void send_get_domain_blacklist() throws TException {
            sendBase("get_domain_blacklist", new get_domain_blacklist_args());
        }

        public void send_get_domain_whitelist() throws TException {
            sendBase("get_domain_whitelist", new get_domain_whitelist_args());
        }

        public void send_get_guide_for_new_strategy() throws TException {
            sendBase("get_guide_for_new_strategy", new get_guide_for_new_strategy_args());
        }

        public void send_get_privacy_agreement_version() throws TException {
            sendBase("get_privacy_agreement_version", new get_privacy_agreement_version_args());
        }

        public void send_get_static_config() throws TException {
            sendBase("get_static_config", new get_static_config_args());
        }

        public void send_get_switches() throws TException {
            sendBase("get_switches", new get_switches_args());
        }

        public void send_get_test_flags() throws TException {
            sendBase("get_test_flags", new get_test_flags_args());
        }

        public void send_qrcode_scan(String qrcode) throws TException {
            qrcode_scan_args qrcode_scan_argsVar = new qrcode_scan_args();
            qrcode_scan_argsVar.setQrcode(qrcode);
            sendBase("qrcode_scan", qrcode_scan_argsVar);
        }

        public void send_report_event(List<String> jsons) throws TException {
            report_event_args report_event_argsVar = new report_event_args();
            report_event_argsVar.setJsons(jsons);
            sendBase("report_event", report_event_argsVar);
        }

        public void send_report_event_without_login(List<String> jsons) throws TException {
            report_event_without_login_args report_event_without_login_argsVar = new report_event_without_login_args();
            report_event_without_login_argsVar.setJsons(jsons);
            sendBase("report_event_without_login", report_event_without_login_argsVar);
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class Factory implements TServiceClientFactory<Client> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.TServiceClientFactory
            public Client getClient(TProtocol prot) {
                return new Client(prot);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.TServiceClientFactory
            public Client getClient(TProtocol iprot, TProtocol oprot) {
                return new Client(iprot, oprot);
            }
        }

        public Client(TProtocol iprot, TProtocol oprot) {
            super(iprot, oprot);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Iface {
        BczVersionInfo check_dict_new_version(BczAppInfo app_info) throws SystemException, LogicException, TException;

        BczSystemInfos check_infos() throws SystemException, LogicException, TException;

        BczVersionInfo check_ireading_new_version(BczAppInfo app_info) throws SystemException, LogicException, TException;

        BczNavTabs check_nav_tabs() throws SystemException, LogicException, TException;

        BczVersionInfo check_new_version(BczAppInfo app_info) throws SystemException, LogicException, TException;

        AppBetaUpdateResult get_app_beta_update_info(AppBetaUpdateRequest request) throws SystemException, LogicException, TException;

        Map<String, String> get_app_feedback_info() throws SystemException, LogicException, TException;

        AppNewVersionResult get_app_new_version_info(AppBetaUpdateRequest request) throws SystemException, LogicException, TException;

        List<String> get_domain_blacklist() throws SystemException, LogicException, TException;

        List<String> get_domain_whitelist() throws SystemException, LogicException, TException;

        GuideForNewStrategy get_guide_for_new_strategy() throws SystemException, LogicException, TException;

        PrivacyAgreementInfo get_privacy_agreement_version() throws SystemException, LogicException, TException;

        List<StaticConfig> get_static_config() throws SystemException, LogicException, TException;

        BczAppSwitch get_switches() throws SystemException, LogicException, TException;

        Map<String, Integer> get_test_flags() throws SystemException, LogicException, TException;

        QRCodeResp qrcode_scan(String qrcode) throws SystemException, LogicException, TException;

        void report_event(List<String> jsons) throws SystemException, LogicException, TException;

        void report_event_without_login(List<String> jsons) throws SystemException, LogicException, TException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Processor<I extends Iface> extends TBaseProcessor<I> implements TProcessor {
        private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_dict_new_version<I extends Iface> extends ProcessFunction<I, check_dict_new_version_args> {
            public check_dict_new_version() {
                super("check_dict_new_version");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public check_dict_new_version_args getEmptyArgsInstance() {
                return new check_dict_new_version_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public check_dict_new_version_result getResult(I iface, check_dict_new_version_args args) throws TException {
                check_dict_new_version_result check_dict_new_version_resultVar = new check_dict_new_version_result();
                try {
                    check_dict_new_version_resultVar.success = iface.check_dict_new_version(args.app_info);
                    return check_dict_new_version_resultVar;
                } catch (LogicException e11) {
                    check_dict_new_version_resultVar.bomb = e11;
                    return check_dict_new_version_resultVar;
                } catch (SystemException e12) {
                    check_dict_new_version_resultVar.boom = e12;
                    return check_dict_new_version_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_infos<I extends Iface> extends ProcessFunction<I, check_infos_args> {
            public check_infos() {
                super("check_infos");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public check_infos_args getEmptyArgsInstance() {
                return new check_infos_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public check_infos_result getResult(I iface, check_infos_args args) throws TException {
                check_infos_result check_infos_resultVar = new check_infos_result();
                try {
                    check_infos_resultVar.success = iface.check_infos();
                    return check_infos_resultVar;
                } catch (LogicException e11) {
                    check_infos_resultVar.bomb = e11;
                    return check_infos_resultVar;
                } catch (SystemException e12) {
                    check_infos_resultVar.boom = e12;
                    return check_infos_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_ireading_new_version<I extends Iface> extends ProcessFunction<I, check_ireading_new_version_args> {
            public check_ireading_new_version() {
                super("check_ireading_new_version");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public check_ireading_new_version_args getEmptyArgsInstance() {
                return new check_ireading_new_version_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public check_ireading_new_version_result getResult(I iface, check_ireading_new_version_args args) throws TException {
                check_ireading_new_version_result check_ireading_new_version_resultVar = new check_ireading_new_version_result();
                try {
                    check_ireading_new_version_resultVar.success = iface.check_ireading_new_version(args.app_info);
                    return check_ireading_new_version_resultVar;
                } catch (LogicException e11) {
                    check_ireading_new_version_resultVar.bomb = e11;
                    return check_ireading_new_version_resultVar;
                } catch (SystemException e12) {
                    check_ireading_new_version_resultVar.boom = e12;
                    return check_ireading_new_version_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_nav_tabs<I extends Iface> extends ProcessFunction<I, check_nav_tabs_args> {
            public check_nav_tabs() {
                super("check_nav_tabs");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public check_nav_tabs_args getEmptyArgsInstance() {
                return new check_nav_tabs_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public check_nav_tabs_result getResult(I iface, check_nav_tabs_args args) throws TException {
                check_nav_tabs_result check_nav_tabs_resultVar = new check_nav_tabs_result();
                try {
                    check_nav_tabs_resultVar.success = iface.check_nav_tabs();
                    return check_nav_tabs_resultVar;
                } catch (LogicException e11) {
                    check_nav_tabs_resultVar.bomb = e11;
                    return check_nav_tabs_resultVar;
                } catch (SystemException e12) {
                    check_nav_tabs_resultVar.boom = e12;
                    return check_nav_tabs_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_new_version<I extends Iface> extends ProcessFunction<I, check_new_version_args> {
            public check_new_version() {
                super("check_new_version");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public check_new_version_args getEmptyArgsInstance() {
                return new check_new_version_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public check_new_version_result getResult(I iface, check_new_version_args args) throws TException {
                check_new_version_result check_new_version_resultVar = new check_new_version_result();
                try {
                    check_new_version_resultVar.success = iface.check_new_version(args.app_info);
                    return check_new_version_resultVar;
                } catch (LogicException e11) {
                    check_new_version_resultVar.bomb = e11;
                    return check_new_version_resultVar;
                } catch (SystemException e12) {
                    check_new_version_resultVar.boom = e12;
                    return check_new_version_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_beta_update_info<I extends Iface> extends ProcessFunction<I, get_app_beta_update_info_args> {
            public get_app_beta_update_info() {
                super("get_app_beta_update_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_app_beta_update_info_args getEmptyArgsInstance() {
                return new get_app_beta_update_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_app_beta_update_info_result getResult(I iface, get_app_beta_update_info_args args) throws TException {
                get_app_beta_update_info_result get_app_beta_update_info_resultVar = new get_app_beta_update_info_result();
                try {
                    get_app_beta_update_info_resultVar.success = iface.get_app_beta_update_info(args.request);
                    return get_app_beta_update_info_resultVar;
                } catch (LogicException e11) {
                    get_app_beta_update_info_resultVar.bomb = e11;
                    return get_app_beta_update_info_resultVar;
                } catch (SystemException e12) {
                    get_app_beta_update_info_resultVar.boom = e12;
                    return get_app_beta_update_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_feedback_info<I extends Iface> extends ProcessFunction<I, get_app_feedback_info_args> {
            public get_app_feedback_info() {
                super("get_app_feedback_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_app_feedback_info_args getEmptyArgsInstance() {
                return new get_app_feedback_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_app_feedback_info_result getResult(I iface, get_app_feedback_info_args args) throws TException {
                get_app_feedback_info_result get_app_feedback_info_resultVar = new get_app_feedback_info_result();
                try {
                    get_app_feedback_info_resultVar.success = iface.get_app_feedback_info();
                    return get_app_feedback_info_resultVar;
                } catch (LogicException e11) {
                    get_app_feedback_info_resultVar.bomb = e11;
                    return get_app_feedback_info_resultVar;
                } catch (SystemException e12) {
                    get_app_feedback_info_resultVar.boom = e12;
                    return get_app_feedback_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_new_version_info<I extends Iface> extends ProcessFunction<I, get_app_new_version_info_args> {
            public get_app_new_version_info() {
                super("get_app_new_version_info");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_app_new_version_info_args getEmptyArgsInstance() {
                return new get_app_new_version_info_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_app_new_version_info_result getResult(I iface, get_app_new_version_info_args args) throws TException {
                get_app_new_version_info_result get_app_new_version_info_resultVar = new get_app_new_version_info_result();
                try {
                    get_app_new_version_info_resultVar.success = iface.get_app_new_version_info(args.request);
                    return get_app_new_version_info_resultVar;
                } catch (LogicException e11) {
                    get_app_new_version_info_resultVar.bomb = e11;
                    return get_app_new_version_info_resultVar;
                } catch (SystemException e12) {
                    get_app_new_version_info_resultVar.boom = e12;
                    return get_app_new_version_info_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_blacklist<I extends Iface> extends ProcessFunction<I, get_domain_blacklist_args> {
            public get_domain_blacklist() {
                super("get_domain_blacklist");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_domain_blacklist_args getEmptyArgsInstance() {
                return new get_domain_blacklist_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_domain_blacklist_result getResult(I iface, get_domain_blacklist_args args) throws TException {
                get_domain_blacklist_result get_domain_blacklist_resultVar = new get_domain_blacklist_result();
                try {
                    get_domain_blacklist_resultVar.success = iface.get_domain_blacklist();
                    return get_domain_blacklist_resultVar;
                } catch (LogicException e11) {
                    get_domain_blacklist_resultVar.bomb = e11;
                    return get_domain_blacklist_resultVar;
                } catch (SystemException e12) {
                    get_domain_blacklist_resultVar.boom = e12;
                    return get_domain_blacklist_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_whitelist<I extends Iface> extends ProcessFunction<I, get_domain_whitelist_args> {
            public get_domain_whitelist() {
                super("get_domain_whitelist");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_domain_whitelist_args getEmptyArgsInstance() {
                return new get_domain_whitelist_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_domain_whitelist_result getResult(I iface, get_domain_whitelist_args args) throws TException {
                get_domain_whitelist_result get_domain_whitelist_resultVar = new get_domain_whitelist_result();
                try {
                    get_domain_whitelist_resultVar.success = iface.get_domain_whitelist();
                    return get_domain_whitelist_resultVar;
                } catch (LogicException e11) {
                    get_domain_whitelist_resultVar.bomb = e11;
                    return get_domain_whitelist_resultVar;
                } catch (SystemException e12) {
                    get_domain_whitelist_resultVar.boom = e12;
                    return get_domain_whitelist_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_guide_for_new_strategy<I extends Iface> extends ProcessFunction<I, get_guide_for_new_strategy_args> {
            public get_guide_for_new_strategy() {
                super("get_guide_for_new_strategy");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_guide_for_new_strategy_args getEmptyArgsInstance() {
                return new get_guide_for_new_strategy_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_guide_for_new_strategy_result getResult(I iface, get_guide_for_new_strategy_args args) throws TException {
                get_guide_for_new_strategy_result get_guide_for_new_strategy_resultVar = new get_guide_for_new_strategy_result();
                try {
                    get_guide_for_new_strategy_resultVar.success = iface.get_guide_for_new_strategy();
                    return get_guide_for_new_strategy_resultVar;
                } catch (LogicException e11) {
                    get_guide_for_new_strategy_resultVar.bomb = e11;
                    return get_guide_for_new_strategy_resultVar;
                } catch (SystemException e12) {
                    get_guide_for_new_strategy_resultVar.boom = e12;
                    return get_guide_for_new_strategy_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_privacy_agreement_version<I extends Iface> extends ProcessFunction<I, get_privacy_agreement_version_args> {
            public get_privacy_agreement_version() {
                super("get_privacy_agreement_version");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_privacy_agreement_version_args getEmptyArgsInstance() {
                return new get_privacy_agreement_version_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_privacy_agreement_version_result getResult(I iface, get_privacy_agreement_version_args args) throws TException {
                get_privacy_agreement_version_result get_privacy_agreement_version_resultVar = new get_privacy_agreement_version_result();
                try {
                    get_privacy_agreement_version_resultVar.success = iface.get_privacy_agreement_version();
                    return get_privacy_agreement_version_resultVar;
                } catch (LogicException e11) {
                    get_privacy_agreement_version_resultVar.bomb = e11;
                    return get_privacy_agreement_version_resultVar;
                } catch (SystemException e12) {
                    get_privacy_agreement_version_resultVar.boom = e12;
                    return get_privacy_agreement_version_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_static_config<I extends Iface> extends ProcessFunction<I, get_static_config_args> {
            public get_static_config() {
                super("get_static_config");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_static_config_args getEmptyArgsInstance() {
                return new get_static_config_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_static_config_result getResult(I iface, get_static_config_args args) throws TException {
                get_static_config_result get_static_config_resultVar = new get_static_config_result();
                try {
                    get_static_config_resultVar.success = iface.get_static_config();
                    return get_static_config_resultVar;
                } catch (LogicException e11) {
                    get_static_config_resultVar.bomb = e11;
                    return get_static_config_resultVar;
                } catch (SystemException e12) {
                    get_static_config_resultVar.boom = e12;
                    return get_static_config_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_switches<I extends Iface> extends ProcessFunction<I, get_switches_args> {
            public get_switches() {
                super("get_switches");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_switches_args getEmptyArgsInstance() {
                return new get_switches_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_switches_result getResult(I iface, get_switches_args args) throws TException {
                get_switches_result get_switches_resultVar = new get_switches_result();
                try {
                    get_switches_resultVar.success = iface.get_switches();
                    return get_switches_resultVar;
                } catch (LogicException e11) {
                    get_switches_resultVar.bomb = e11;
                    return get_switches_resultVar;
                } catch (SystemException e12) {
                    get_switches_resultVar.boom = e12;
                    return get_switches_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_test_flags<I extends Iface> extends ProcessFunction<I, get_test_flags_args> {
            public get_test_flags() {
                super("get_test_flags");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public get_test_flags_args getEmptyArgsInstance() {
                return new get_test_flags_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public get_test_flags_result getResult(I iface, get_test_flags_args args) throws TException {
                get_test_flags_result get_test_flags_resultVar = new get_test_flags_result();
                try {
                    get_test_flags_resultVar.success = iface.get_test_flags();
                    return get_test_flags_resultVar;
                } catch (LogicException e11) {
                    get_test_flags_resultVar.bomb = e11;
                    return get_test_flags_resultVar;
                } catch (SystemException e12) {
                    get_test_flags_resultVar.boom = e12;
                    return get_test_flags_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan<I extends Iface> extends ProcessFunction<I, qrcode_scan_args> {
            public qrcode_scan() {
                super("qrcode_scan");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public qrcode_scan_args getEmptyArgsInstance() {
                return new qrcode_scan_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public qrcode_scan_result getResult(I iface, qrcode_scan_args args) throws TException {
                qrcode_scan_result qrcode_scan_resultVar = new qrcode_scan_result();
                try {
                    qrcode_scan_resultVar.success = iface.qrcode_scan(args.qrcode);
                    return qrcode_scan_resultVar;
                } catch (LogicException e11) {
                    qrcode_scan_resultVar.bomb = e11;
                    return qrcode_scan_resultVar;
                } catch (SystemException e12) {
                    qrcode_scan_resultVar.boom = e12;
                    return qrcode_scan_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event<I extends Iface> extends ProcessFunction<I, report_event_args> {
            public report_event() {
                super("report_event");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public report_event_args getEmptyArgsInstance() {
                return new report_event_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public report_event_result getResult(I iface, report_event_args args) throws TException {
                report_event_result report_event_resultVar = new report_event_result();
                try {
                    iface.report_event(args.jsons);
                    return report_event_resultVar;
                } catch (LogicException e11) {
                    report_event_resultVar.bomb = e11;
                    return report_event_resultVar;
                } catch (SystemException e12) {
                    report_event_resultVar.boom = e12;
                    return report_event_resultVar;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_without_login<I extends Iface> extends ProcessFunction<I, report_event_without_login_args> {
            public report_event_without_login() {
                super("report_event_without_login");
            }

            @Override // org.apache.thrift.ProcessFunction
            public boolean isOneway() {
                return false;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.apache.thrift.ProcessFunction
            public report_event_without_login_args getEmptyArgsInstance() {
                return new report_event_without_login_args();
            }

            @Override // org.apache.thrift.ProcessFunction
            public report_event_without_login_result getResult(I iface, report_event_without_login_args args) throws TException {
                report_event_without_login_result report_event_without_login_resultVar = new report_event_without_login_result();
                try {
                    iface.report_event_without_login(args.jsons);
                    return report_event_without_login_resultVar;
                } catch (LogicException e11) {
                    report_event_without_login_resultVar.bomb = e11;
                    return report_event_without_login_resultVar;
                } catch (SystemException e12) {
                    report_event_without_login_resultVar.boom = e12;
                    return report_event_without_login_resultVar;
                }
            }
        }

        public Processor(I iface) {
            super(iface, getProcessMap(new HashMap()));
        }

        private static <I extends Iface> Map<String, ProcessFunction<I, ? extends TBase>> getProcessMap(Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            processMap.put("check_infos", new check_infos());
            processMap.put("check_new_version", new check_new_version());
            processMap.put("get_domain_blacklist", new get_domain_blacklist());
            processMap.put("get_domain_whitelist", new get_domain_whitelist());
            processMap.put("check_dict_new_version", new check_dict_new_version());
            processMap.put("check_ireading_new_version", new check_ireading_new_version());
            processMap.put("get_switches", new get_switches());
            processMap.put("check_nav_tabs", new check_nav_tabs());
            processMap.put("report_event", new report_event());
            processMap.put("report_event_without_login", new report_event_without_login());
            processMap.put("get_guide_for_new_strategy", new get_guide_for_new_strategy());
            processMap.put("get_test_flags", new get_test_flags());
            processMap.put("get_static_config", new get_static_config());
            processMap.put("qrcode_scan", new qrcode_scan());
            processMap.put("get_privacy_agreement_version", new get_privacy_agreement_version());
            processMap.put("get_app_beta_update_info", new get_app_beta_update_info());
            processMap.put("get_app_new_version_info", new get_app_new_version_info());
            processMap.put("get_app_feedback_info", new get_app_feedback_info());
            return processMap;
        }

        public Processor(I iface, Map<String, ProcessFunction<I, ? extends TBase>> processMap) {
            super(iface, getProcessMap(processMap));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class check_dict_new_version_args implements TBase<check_dict_new_version_args, _Fields>, Serializable, Cloneable, Comparable<check_dict_new_version_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BczAppInfo app_info;
        private static final TStruct STRUCT_DESC = new TStruct("check_dict_new_version_args");
        private static final TField APP_INFO_FIELD_DESC = new TField("app_info", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            APP_INFO(1, "app_info");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId != 1) {
                    return null;
                }
                return APP_INFO;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_dict_new_version_argsStandardScheme extends StandardScheme<check_dict_new_version_args> {
            private check_dict_new_version_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, check_dict_new_version_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 12) {
                        BczAppInfo bczAppInfo = new BczAppInfo();
                        struct.app_info = bczAppInfo;
                        bczAppInfo.read(iprot);
                        struct.setApp_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, check_dict_new_version_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(check_dict_new_version_args.STRUCT_DESC);
                if (struct.app_info != null) {
                    oprot.writeFieldBegin(check_dict_new_version_args.APP_INFO_FIELD_DESC);
                    struct.app_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_dict_new_version_argsStandardSchemeFactory implements SchemeFactory {
            private check_dict_new_version_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_dict_new_version_argsStandardScheme getScheme() {
                return new check_dict_new_version_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_dict_new_version_argsTupleScheme extends TupleScheme<check_dict_new_version_args> {
            private check_dict_new_version_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, check_dict_new_version_args struct) throws TException {
                BczAppInfo bczAppInfo = new BczAppInfo();
                struct.app_info = bczAppInfo;
                bczAppInfo.read((TTupleProtocol) prot);
                struct.setApp_infoIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, check_dict_new_version_args struct) throws TException {
                struct.app_info.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_dict_new_version_argsTupleSchemeFactory implements SchemeFactory {
            private check_dict_new_version_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_dict_new_version_argsTupleScheme getScheme() {
                return new check_dict_new_version_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new check_dict_new_version_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new check_dict_new_version_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.APP_INFO, (_Fields) new FieldMetaData("app_info", (byte) 1, new StructMetaData((byte) 12, BczAppInfo.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(check_dict_new_version_args.class, unmodifiableMap);
        }

        public check_dict_new_version_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.app_info = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof check_dict_new_version_args)) {
                return equals((check_dict_new_version_args) that);
            }
            return false;
        }

        public BczAppInfo getApp_info() {
            return this.app_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetApp_info() {
            return this.app_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public check_dict_new_version_args setApp_info(BczAppInfo app_info) {
            this.app_info = app_info;
            return this;
        }

        public void setApp_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.app_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("check_dict_new_version_args(");
            sb2.append("app_info:");
            BczAppInfo bczAppInfo = this.app_info;
            if (bczAppInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bczAppInfo);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetApp_info() {
            this.app_info = null;
        }

        public void validate() throws TException {
            BczAppInfo bczAppInfo = this.app_info;
            if (bczAppInfo != null) {
                if (bczAppInfo != null) {
                    bczAppInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'app_info' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public check_dict_new_version_args(BczAppInfo app_info) {
            this();
            this.app_info = app_info;
        }

        @Override // java.lang.Comparable
        public int compareTo(check_dict_new_version_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetApp_info()).compareTo(Boolean.valueOf(other.isSetApp_info()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetApp_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.app_info, (Comparable) other.app_info)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<check_dict_new_version_args, _Fields> deepCopy2() {
            return new check_dict_new_version_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_dict_new_version_args$_Fields[field.ordinal()] == 1) {
                return getApp_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_dict_new_version_args$_Fields[field.ordinal()] == 1) {
                return isSetApp_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_dict_new_version_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetApp_info();
            } else {
                setApp_info((BczAppInfo) value);
            }
        }

        public boolean equals(check_dict_new_version_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetApp_info = isSetApp_info();
            boolean isSetApp_info2 = that.isSetApp_info();
            if (isSetApp_info || isSetApp_info2) {
                return isSetApp_info && isSetApp_info2 && this.app_info.equals(that.app_info);
            }
            return true;
        }

        public check_dict_new_version_args(check_dict_new_version_args other) {
            if (other.isSetApp_info()) {
                this.app_info = new BczAppInfo(other.app_info);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class check_dict_new_version_result implements TBase<check_dict_new_version_result, _Fields>, Serializable, Cloneable, Comparable<check_dict_new_version_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public BczVersionInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("check_dict_new_version_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_dict_new_version_resultStandardScheme extends StandardScheme<check_dict_new_version_result> {
            private check_dict_new_version_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, check_dict_new_version_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        BczVersionInfo bczVersionInfo = new BczVersionInfo();
                        struct.success = bczVersionInfo;
                        bczVersionInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, check_dict_new_version_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(check_dict_new_version_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(check_dict_new_version_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(check_dict_new_version_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(check_dict_new_version_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_dict_new_version_resultStandardSchemeFactory implements SchemeFactory {
            private check_dict_new_version_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_dict_new_version_resultStandardScheme getScheme() {
                return new check_dict_new_version_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_dict_new_version_resultTupleScheme extends TupleScheme<check_dict_new_version_result> {
            private check_dict_new_version_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, check_dict_new_version_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BczVersionInfo bczVersionInfo = new BczVersionInfo();
                    struct.success = bczVersionInfo;
                    bczVersionInfo.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, check_dict_new_version_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_dict_new_version_resultTupleSchemeFactory implements SchemeFactory {
            private check_dict_new_version_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_dict_new_version_resultTupleScheme getScheme() {
                return new check_dict_new_version_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new check_dict_new_version_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new check_dict_new_version_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BczVersionInfo.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(check_dict_new_version_result.class, unmodifiableMap);
        }

        public check_dict_new_version_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof check_dict_new_version_result)) {
                return equals((check_dict_new_version_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public BczVersionInfo getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public check_dict_new_version_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public check_dict_new_version_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public check_dict_new_version_result setSuccess(BczVersionInfo success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("check_dict_new_version_result(");
            sb2.append("success:");
            BczVersionInfo bczVersionInfo = this.success;
            if (bczVersionInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bczVersionInfo);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            BczVersionInfo bczVersionInfo = this.success;
            if (bczVersionInfo != null) {
                bczVersionInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public check_dict_new_version_result(BczVersionInfo success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(check_dict_new_version_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<check_dict_new_version_result, _Fields> deepCopy2() {
            return new check_dict_new_version_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_dict_new_version_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_dict_new_version_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_dict_new_version_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BczVersionInfo) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(check_dict_new_version_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public check_dict_new_version_result(check_dict_new_version_result other) {
            if (other.isSetSuccess()) {
                this.success = new BczVersionInfo(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class check_infos_args implements TBase<check_infos_args, _Fields>, Serializable, Cloneable, Comparable<check_infos_args> {
        private static final TStruct STRUCT_DESC = new TStruct("check_infos_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                return null;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_infos_argsStandardScheme extends StandardScheme<check_infos_args> {
            private check_infos_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, check_infos_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, check_infos_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(check_infos_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_infos_argsStandardSchemeFactory implements SchemeFactory {
            private check_infos_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_infos_argsStandardScheme getScheme() {
                return new check_infos_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_infos_argsTupleScheme extends TupleScheme<check_infos_args> {
            private check_infos_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, check_infos_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, check_infos_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_infos_argsTupleSchemeFactory implements SchemeFactory {
            private check_infos_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_infos_argsTupleScheme getScheme() {
                return new check_infos_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new check_infos_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new check_infos_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(check_infos_args.class, unmodifiableMap);
        }

        public check_infos_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public boolean equals(check_infos_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "check_infos_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public check_infos_args(check_infos_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(check_infos_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<check_infos_args, _Fields> deepCopy2() {
            return new check_infos_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof check_infos_args)) {
                return equals((check_infos_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_infos_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_infos_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_infos_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class check_infos_result implements TBase<check_infos_result, _Fields>, Serializable, Cloneable, Comparable<check_infos_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public BczSystemInfos success;
        private static final TStruct STRUCT_DESC = new TStruct("check_infos_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_infos_resultStandardScheme extends StandardScheme<check_infos_result> {
            private check_infos_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, check_infos_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        BczSystemInfos bczSystemInfos = new BczSystemInfos();
                        struct.success = bczSystemInfos;
                        bczSystemInfos.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, check_infos_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(check_infos_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(check_infos_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(check_infos_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(check_infos_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_infos_resultStandardSchemeFactory implements SchemeFactory {
            private check_infos_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_infos_resultStandardScheme getScheme() {
                return new check_infos_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_infos_resultTupleScheme extends TupleScheme<check_infos_result> {
            private check_infos_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, check_infos_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BczSystemInfos bczSystemInfos = new BczSystemInfos();
                    struct.success = bczSystemInfos;
                    bczSystemInfos.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, check_infos_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_infos_resultTupleSchemeFactory implements SchemeFactory {
            private check_infos_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_infos_resultTupleScheme getScheme() {
                return new check_infos_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new check_infos_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new check_infos_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BczSystemInfos.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(check_infos_result.class, unmodifiableMap);
        }

        public check_infos_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof check_infos_result)) {
                return equals((check_infos_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public BczSystemInfos getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public check_infos_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public check_infos_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public check_infos_result setSuccess(BczSystemInfos success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("check_infos_result(");
            sb2.append("success:");
            BczSystemInfos bczSystemInfos = this.success;
            if (bczSystemInfos == null) {
                sb2.append("null");
            } else {
                sb2.append(bczSystemInfos);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            BczSystemInfos bczSystemInfos = this.success;
            if (bczSystemInfos != null) {
                bczSystemInfos.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public check_infos_result(BczSystemInfos success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(check_infos_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<check_infos_result, _Fields> deepCopy2() {
            return new check_infos_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_infos_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_infos_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_infos_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BczSystemInfos) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(check_infos_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public check_infos_result(check_infos_result other) {
            if (other.isSetSuccess()) {
                this.success = new BczSystemInfos(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class check_ireading_new_version_args implements TBase<check_ireading_new_version_args, _Fields>, Serializable, Cloneable, Comparable<check_ireading_new_version_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BczAppInfo app_info;
        private static final TStruct STRUCT_DESC = new TStruct("check_ireading_new_version_args");
        private static final TField APP_INFO_FIELD_DESC = new TField("app_info", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            APP_INFO(1, "app_info");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId != 1) {
                    return null;
                }
                return APP_INFO;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_ireading_new_version_argsStandardScheme extends StandardScheme<check_ireading_new_version_args> {
            private check_ireading_new_version_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, check_ireading_new_version_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 12) {
                        BczAppInfo bczAppInfo = new BczAppInfo();
                        struct.app_info = bczAppInfo;
                        bczAppInfo.read(iprot);
                        struct.setApp_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, check_ireading_new_version_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(check_ireading_new_version_args.STRUCT_DESC);
                if (struct.app_info != null) {
                    oprot.writeFieldBegin(check_ireading_new_version_args.APP_INFO_FIELD_DESC);
                    struct.app_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_ireading_new_version_argsStandardSchemeFactory implements SchemeFactory {
            private check_ireading_new_version_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_ireading_new_version_argsStandardScheme getScheme() {
                return new check_ireading_new_version_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_ireading_new_version_argsTupleScheme extends TupleScheme<check_ireading_new_version_args> {
            private check_ireading_new_version_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, check_ireading_new_version_args struct) throws TException {
                BczAppInfo bczAppInfo = new BczAppInfo();
                struct.app_info = bczAppInfo;
                bczAppInfo.read((TTupleProtocol) prot);
                struct.setApp_infoIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, check_ireading_new_version_args struct) throws TException {
                struct.app_info.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_ireading_new_version_argsTupleSchemeFactory implements SchemeFactory {
            private check_ireading_new_version_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_ireading_new_version_argsTupleScheme getScheme() {
                return new check_ireading_new_version_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new check_ireading_new_version_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new check_ireading_new_version_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.APP_INFO, (_Fields) new FieldMetaData("app_info", (byte) 1, new StructMetaData((byte) 12, BczAppInfo.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(check_ireading_new_version_args.class, unmodifiableMap);
        }

        public check_ireading_new_version_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.app_info = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof check_ireading_new_version_args)) {
                return equals((check_ireading_new_version_args) that);
            }
            return false;
        }

        public BczAppInfo getApp_info() {
            return this.app_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetApp_info() {
            return this.app_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public check_ireading_new_version_args setApp_info(BczAppInfo app_info) {
            this.app_info = app_info;
            return this;
        }

        public void setApp_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.app_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("check_ireading_new_version_args(");
            sb2.append("app_info:");
            BczAppInfo bczAppInfo = this.app_info;
            if (bczAppInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bczAppInfo);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetApp_info() {
            this.app_info = null;
        }

        public void validate() throws TException {
            BczAppInfo bczAppInfo = this.app_info;
            if (bczAppInfo != null) {
                if (bczAppInfo != null) {
                    bczAppInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'app_info' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public check_ireading_new_version_args(BczAppInfo app_info) {
            this();
            this.app_info = app_info;
        }

        @Override // java.lang.Comparable
        public int compareTo(check_ireading_new_version_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetApp_info()).compareTo(Boolean.valueOf(other.isSetApp_info()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetApp_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.app_info, (Comparable) other.app_info)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<check_ireading_new_version_args, _Fields> deepCopy2() {
            return new check_ireading_new_version_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_ireading_new_version_args$_Fields[field.ordinal()] == 1) {
                return getApp_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_ireading_new_version_args$_Fields[field.ordinal()] == 1) {
                return isSetApp_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_ireading_new_version_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetApp_info();
            } else {
                setApp_info((BczAppInfo) value);
            }
        }

        public boolean equals(check_ireading_new_version_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetApp_info = isSetApp_info();
            boolean isSetApp_info2 = that.isSetApp_info();
            if (isSetApp_info || isSetApp_info2) {
                return isSetApp_info && isSetApp_info2 && this.app_info.equals(that.app_info);
            }
            return true;
        }

        public check_ireading_new_version_args(check_ireading_new_version_args other) {
            if (other.isSetApp_info()) {
                this.app_info = new BczAppInfo(other.app_info);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class check_ireading_new_version_result implements TBase<check_ireading_new_version_result, _Fields>, Serializable, Cloneable, Comparable<check_ireading_new_version_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public BczVersionInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("check_ireading_new_version_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_ireading_new_version_resultStandardScheme extends StandardScheme<check_ireading_new_version_result> {
            private check_ireading_new_version_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, check_ireading_new_version_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        BczVersionInfo bczVersionInfo = new BczVersionInfo();
                        struct.success = bczVersionInfo;
                        bczVersionInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, check_ireading_new_version_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(check_ireading_new_version_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(check_ireading_new_version_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(check_ireading_new_version_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(check_ireading_new_version_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_ireading_new_version_resultStandardSchemeFactory implements SchemeFactory {
            private check_ireading_new_version_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_ireading_new_version_resultStandardScheme getScheme() {
                return new check_ireading_new_version_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_ireading_new_version_resultTupleScheme extends TupleScheme<check_ireading_new_version_result> {
            private check_ireading_new_version_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, check_ireading_new_version_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BczVersionInfo bczVersionInfo = new BczVersionInfo();
                    struct.success = bczVersionInfo;
                    bczVersionInfo.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, check_ireading_new_version_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_ireading_new_version_resultTupleSchemeFactory implements SchemeFactory {
            private check_ireading_new_version_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_ireading_new_version_resultTupleScheme getScheme() {
                return new check_ireading_new_version_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new check_ireading_new_version_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new check_ireading_new_version_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BczVersionInfo.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(check_ireading_new_version_result.class, unmodifiableMap);
        }

        public check_ireading_new_version_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof check_ireading_new_version_result)) {
                return equals((check_ireading_new_version_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public BczVersionInfo getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public check_ireading_new_version_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public check_ireading_new_version_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public check_ireading_new_version_result setSuccess(BczVersionInfo success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("check_ireading_new_version_result(");
            sb2.append("success:");
            BczVersionInfo bczVersionInfo = this.success;
            if (bczVersionInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bczVersionInfo);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            BczVersionInfo bczVersionInfo = this.success;
            if (bczVersionInfo != null) {
                bczVersionInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public check_ireading_new_version_result(BczVersionInfo success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(check_ireading_new_version_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<check_ireading_new_version_result, _Fields> deepCopy2() {
            return new check_ireading_new_version_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_ireading_new_version_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_ireading_new_version_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_ireading_new_version_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BczVersionInfo) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(check_ireading_new_version_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public check_ireading_new_version_result(check_ireading_new_version_result other) {
            if (other.isSetSuccess()) {
                this.success = new BczVersionInfo(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class check_nav_tabs_args implements TBase<check_nav_tabs_args, _Fields>, Serializable, Cloneable, Comparable<check_nav_tabs_args> {
        private static final TStruct STRUCT_DESC = new TStruct("check_nav_tabs_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                return null;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_nav_tabs_argsStandardScheme extends StandardScheme<check_nav_tabs_args> {
            private check_nav_tabs_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, check_nav_tabs_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, check_nav_tabs_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(check_nav_tabs_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_nav_tabs_argsStandardSchemeFactory implements SchemeFactory {
            private check_nav_tabs_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_nav_tabs_argsStandardScheme getScheme() {
                return new check_nav_tabs_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_nav_tabs_argsTupleScheme extends TupleScheme<check_nav_tabs_args> {
            private check_nav_tabs_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, check_nav_tabs_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, check_nav_tabs_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_nav_tabs_argsTupleSchemeFactory implements SchemeFactory {
            private check_nav_tabs_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_nav_tabs_argsTupleScheme getScheme() {
                return new check_nav_tabs_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new check_nav_tabs_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new check_nav_tabs_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(check_nav_tabs_args.class, unmodifiableMap);
        }

        public check_nav_tabs_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public boolean equals(check_nav_tabs_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "check_nav_tabs_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public check_nav_tabs_args(check_nav_tabs_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(check_nav_tabs_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<check_nav_tabs_args, _Fields> deepCopy2() {
            return new check_nav_tabs_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof check_nav_tabs_args)) {
                return equals((check_nav_tabs_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_nav_tabs_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_nav_tabs_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_nav_tabs_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class check_nav_tabs_result implements TBase<check_nav_tabs_result, _Fields>, Serializable, Cloneable, Comparable<check_nav_tabs_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public BczNavTabs success;
        private static final TStruct STRUCT_DESC = new TStruct("check_nav_tabs_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_nav_tabs_resultStandardScheme extends StandardScheme<check_nav_tabs_result> {
            private check_nav_tabs_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, check_nav_tabs_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        BczNavTabs bczNavTabs = new BczNavTabs();
                        struct.success = bczNavTabs;
                        bczNavTabs.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, check_nav_tabs_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(check_nav_tabs_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(check_nav_tabs_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(check_nav_tabs_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(check_nav_tabs_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_nav_tabs_resultStandardSchemeFactory implements SchemeFactory {
            private check_nav_tabs_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_nav_tabs_resultStandardScheme getScheme() {
                return new check_nav_tabs_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_nav_tabs_resultTupleScheme extends TupleScheme<check_nav_tabs_result> {
            private check_nav_tabs_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, check_nav_tabs_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BczNavTabs bczNavTabs = new BczNavTabs();
                    struct.success = bczNavTabs;
                    bczNavTabs.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, check_nav_tabs_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_nav_tabs_resultTupleSchemeFactory implements SchemeFactory {
            private check_nav_tabs_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_nav_tabs_resultTupleScheme getScheme() {
                return new check_nav_tabs_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new check_nav_tabs_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new check_nav_tabs_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BczNavTabs.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(check_nav_tabs_result.class, unmodifiableMap);
        }

        public check_nav_tabs_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof check_nav_tabs_result)) {
                return equals((check_nav_tabs_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public BczNavTabs getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public check_nav_tabs_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public check_nav_tabs_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public check_nav_tabs_result setSuccess(BczNavTabs success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("check_nav_tabs_result(");
            sb2.append("success:");
            BczNavTabs bczNavTabs = this.success;
            if (bczNavTabs == null) {
                sb2.append("null");
            } else {
                sb2.append(bczNavTabs);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            BczNavTabs bczNavTabs = this.success;
            if (bczNavTabs != null) {
                bczNavTabs.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public check_nav_tabs_result(BczNavTabs success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(check_nav_tabs_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<check_nav_tabs_result, _Fields> deepCopy2() {
            return new check_nav_tabs_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_nav_tabs_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_nav_tabs_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_nav_tabs_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BczNavTabs) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(check_nav_tabs_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public check_nav_tabs_result(check_nav_tabs_result other) {
            if (other.isSetSuccess()) {
                this.success = new BczNavTabs(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class check_new_version_args implements TBase<check_new_version_args, _Fields>, Serializable, Cloneable, Comparable<check_new_version_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public BczAppInfo app_info;
        private static final TStruct STRUCT_DESC = new TStruct("check_new_version_args");
        private static final TField APP_INFO_FIELD_DESC = new TField("app_info", (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            APP_INFO(1, "app_info");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId != 1) {
                    return null;
                }
                return APP_INFO;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_new_version_argsStandardScheme extends StandardScheme<check_new_version_args> {
            private check_new_version_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, check_new_version_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 12) {
                        BczAppInfo bczAppInfo = new BczAppInfo();
                        struct.app_info = bczAppInfo;
                        bczAppInfo.read(iprot);
                        struct.setApp_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, check_new_version_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(check_new_version_args.STRUCT_DESC);
                if (struct.app_info != null) {
                    oprot.writeFieldBegin(check_new_version_args.APP_INFO_FIELD_DESC);
                    struct.app_info.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_new_version_argsStandardSchemeFactory implements SchemeFactory {
            private check_new_version_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_new_version_argsStandardScheme getScheme() {
                return new check_new_version_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_new_version_argsTupleScheme extends TupleScheme<check_new_version_args> {
            private check_new_version_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, check_new_version_args struct) throws TException {
                BczAppInfo bczAppInfo = new BczAppInfo();
                struct.app_info = bczAppInfo;
                bczAppInfo.read((TTupleProtocol) prot);
                struct.setApp_infoIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, check_new_version_args struct) throws TException {
                struct.app_info.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_new_version_argsTupleSchemeFactory implements SchemeFactory {
            private check_new_version_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_new_version_argsTupleScheme getScheme() {
                return new check_new_version_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new check_new_version_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new check_new_version_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.APP_INFO, (_Fields) new FieldMetaData("app_info", (byte) 1, new StructMetaData((byte) 12, BczAppInfo.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(check_new_version_args.class, unmodifiableMap);
        }

        public check_new_version_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.app_info = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof check_new_version_args)) {
                return equals((check_new_version_args) that);
            }
            return false;
        }

        public BczAppInfo getApp_info() {
            return this.app_info;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetApp_info() {
            return this.app_info != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public check_new_version_args setApp_info(BczAppInfo app_info) {
            this.app_info = app_info;
            return this;
        }

        public void setApp_infoIsSet(boolean value) {
            if (value) {
                return;
            }
            this.app_info = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("check_new_version_args(");
            sb2.append("app_info:");
            BczAppInfo bczAppInfo = this.app_info;
            if (bczAppInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bczAppInfo);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetApp_info() {
            this.app_info = null;
        }

        public void validate() throws TException {
            BczAppInfo bczAppInfo = this.app_info;
            if (bczAppInfo != null) {
                if (bczAppInfo != null) {
                    bczAppInfo.validate();
                }
            } else {
                throw new TProtocolException("Required field 'app_info' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public check_new_version_args(BczAppInfo app_info) {
            this();
            this.app_info = app_info;
        }

        @Override // java.lang.Comparable
        public int compareTo(check_new_version_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetApp_info()).compareTo(Boolean.valueOf(other.isSetApp_info()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetApp_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.app_info, (Comparable) other.app_info)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<check_new_version_args, _Fields> deepCopy2() {
            return new check_new_version_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_new_version_args$_Fields[field.ordinal()] == 1) {
                return getApp_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_new_version_args$_Fields[field.ordinal()] == 1) {
                return isSetApp_info();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_new_version_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetApp_info();
            } else {
                setApp_info((BczAppInfo) value);
            }
        }

        public boolean equals(check_new_version_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetApp_info = isSetApp_info();
            boolean isSetApp_info2 = that.isSetApp_info();
            if (isSetApp_info || isSetApp_info2) {
                return isSetApp_info && isSetApp_info2 && this.app_info.equals(that.app_info);
            }
            return true;
        }

        public check_new_version_args(check_new_version_args other) {
            if (other.isSetApp_info()) {
                this.app_info = new BczAppInfo(other.app_info);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class check_new_version_result implements TBase<check_new_version_result, _Fields>, Serializable, Cloneable, Comparable<check_new_version_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public BczVersionInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("check_new_version_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_new_version_resultStandardScheme extends StandardScheme<check_new_version_result> {
            private check_new_version_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, check_new_version_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        BczVersionInfo bczVersionInfo = new BczVersionInfo();
                        struct.success = bczVersionInfo;
                        bczVersionInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, check_new_version_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(check_new_version_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(check_new_version_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(check_new_version_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(check_new_version_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_new_version_resultStandardSchemeFactory implements SchemeFactory {
            private check_new_version_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_new_version_resultStandardScheme getScheme() {
                return new check_new_version_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_new_version_resultTupleScheme extends TupleScheme<check_new_version_result> {
            private check_new_version_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, check_new_version_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BczVersionInfo bczVersionInfo = new BczVersionInfo();
                    struct.success = bczVersionInfo;
                    bczVersionInfo.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, check_new_version_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class check_new_version_resultTupleSchemeFactory implements SchemeFactory {
            private check_new_version_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public check_new_version_resultTupleScheme getScheme() {
                return new check_new_version_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new check_new_version_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new check_new_version_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BczVersionInfo.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(check_new_version_result.class, unmodifiableMap);
        }

        public check_new_version_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof check_new_version_result)) {
                return equals((check_new_version_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public BczVersionInfo getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public check_new_version_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public check_new_version_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public check_new_version_result setSuccess(BczVersionInfo success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("check_new_version_result(");
            sb2.append("success:");
            BczVersionInfo bczVersionInfo = this.success;
            if (bczVersionInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bczVersionInfo);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            BczVersionInfo bczVersionInfo = this.success;
            if (bczVersionInfo != null) {
                bczVersionInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public check_new_version_result(BczVersionInfo success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(check_new_version_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<check_new_version_result, _Fields> deepCopy2() {
            return new check_new_version_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_new_version_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_new_version_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$check_new_version_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BczVersionInfo) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(check_new_version_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public check_new_version_result(check_new_version_result other) {
            if (other.isSetSuccess()) {
                this.success = new BczVersionInfo(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_app_beta_update_info_args implements TBase<get_app_beta_update_info_args, _Fields>, Serializable, Cloneable, Comparable<get_app_beta_update_info_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public AppBetaUpdateRequest request;
        private static final TStruct STRUCT_DESC = new TStruct("get_app_beta_update_info_args");
        private static final TField REQUEST_FIELD_DESC = new TField(SocialConstants.TYPE_REQUEST, (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            REQUEST(1, SocialConstants.TYPE_REQUEST);

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId != 1) {
                    return null;
                }
                return REQUEST;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_beta_update_info_argsStandardScheme extends StandardScheme<get_app_beta_update_info_args> {
            private get_app_beta_update_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_app_beta_update_info_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 12) {
                        AppBetaUpdateRequest appBetaUpdateRequest = new AppBetaUpdateRequest();
                        struct.request = appBetaUpdateRequest;
                        appBetaUpdateRequest.read(iprot);
                        struct.setRequestIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_app_beta_update_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_app_beta_update_info_args.STRUCT_DESC);
                if (struct.request != null) {
                    oprot.writeFieldBegin(get_app_beta_update_info_args.REQUEST_FIELD_DESC);
                    struct.request.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_beta_update_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_app_beta_update_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_beta_update_info_argsStandardScheme getScheme() {
                return new get_app_beta_update_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_beta_update_info_argsTupleScheme extends TupleScheme<get_app_beta_update_info_args> {
            private get_app_beta_update_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_app_beta_update_info_args struct) throws TException {
                AppBetaUpdateRequest appBetaUpdateRequest = new AppBetaUpdateRequest();
                struct.request = appBetaUpdateRequest;
                appBetaUpdateRequest.read((TTupleProtocol) prot);
                struct.setRequestIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_app_beta_update_info_args struct) throws TException {
                struct.request.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_beta_update_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_app_beta_update_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_beta_update_info_argsTupleScheme getScheme() {
                return new get_app_beta_update_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_app_beta_update_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_app_beta_update_info_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.REQUEST, (_Fields) new FieldMetaData(SocialConstants.TYPE_REQUEST, (byte) 1, new StructMetaData((byte) 12, AppBetaUpdateRequest.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_app_beta_update_info_args.class, unmodifiableMap);
        }

        public get_app_beta_update_info_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.request = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_app_beta_update_info_args)) {
                return equals((get_app_beta_update_info_args) that);
            }
            return false;
        }

        public AppBetaUpdateRequest getRequest() {
            return this.request;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetRequest() {
            return this.request != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_app_beta_update_info_args setRequest(AppBetaUpdateRequest request) {
            this.request = request;
            return this;
        }

        public void setRequestIsSet(boolean value) {
            if (value) {
                return;
            }
            this.request = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_app_beta_update_info_args(");
            sb2.append("request:");
            AppBetaUpdateRequest appBetaUpdateRequest = this.request;
            if (appBetaUpdateRequest == null) {
                sb2.append("null");
            } else {
                sb2.append(appBetaUpdateRequest);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetRequest() {
            this.request = null;
        }

        public void validate() throws TException {
            AppBetaUpdateRequest appBetaUpdateRequest = this.request;
            if (appBetaUpdateRequest != null) {
                if (appBetaUpdateRequest != null) {
                    appBetaUpdateRequest.validate();
                }
            } else {
                throw new TProtocolException("Required field 'request' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_app_beta_update_info_args(AppBetaUpdateRequest request) {
            this();
            this.request = request;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_app_beta_update_info_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetRequest()).compareTo(Boolean.valueOf(other.isSetRequest()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetRequest() || (compareTo = TBaseHelper.compareTo((Comparable) this.request, (Comparable) other.request)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_app_beta_update_info_args, _Fields> deepCopy2() {
            return new get_app_beta_update_info_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_beta_update_info_args$_Fields[field.ordinal()] == 1) {
                return getRequest();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_beta_update_info_args$_Fields[field.ordinal()] == 1) {
                return isSetRequest();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_beta_update_info_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetRequest();
            } else {
                setRequest((AppBetaUpdateRequest) value);
            }
        }

        public boolean equals(get_app_beta_update_info_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetRequest = isSetRequest();
            boolean isSetRequest2 = that.isSetRequest();
            if (isSetRequest || isSetRequest2) {
                return isSetRequest && isSetRequest2 && this.request.equals(that.request);
            }
            return true;
        }

        public get_app_beta_update_info_args(get_app_beta_update_info_args other) {
            if (other.isSetRequest()) {
                this.request = new AppBetaUpdateRequest(other.request);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_app_beta_update_info_result implements TBase<get_app_beta_update_info_result, _Fields>, Serializable, Cloneable, Comparable<get_app_beta_update_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public AppBetaUpdateResult success;
        private static final TStruct STRUCT_DESC = new TStruct("get_app_beta_update_info_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_beta_update_info_resultStandardScheme extends StandardScheme<get_app_beta_update_info_result> {
            private get_app_beta_update_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_app_beta_update_info_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        AppBetaUpdateResult appBetaUpdateResult = new AppBetaUpdateResult();
                        struct.success = appBetaUpdateResult;
                        appBetaUpdateResult.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_app_beta_update_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_app_beta_update_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_app_beta_update_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_app_beta_update_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_app_beta_update_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_beta_update_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_app_beta_update_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_beta_update_info_resultStandardScheme getScheme() {
                return new get_app_beta_update_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_beta_update_info_resultTupleScheme extends TupleScheme<get_app_beta_update_info_result> {
            private get_app_beta_update_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_app_beta_update_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    AppBetaUpdateResult appBetaUpdateResult = new AppBetaUpdateResult();
                    struct.success = appBetaUpdateResult;
                    appBetaUpdateResult.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_app_beta_update_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_beta_update_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_app_beta_update_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_beta_update_info_resultTupleScheme getScheme() {
                return new get_app_beta_update_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_app_beta_update_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_app_beta_update_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, AppBetaUpdateResult.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_app_beta_update_info_result.class, unmodifiableMap);
        }

        public get_app_beta_update_info_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_app_beta_update_info_result)) {
                return equals((get_app_beta_update_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public AppBetaUpdateResult getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_app_beta_update_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_app_beta_update_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_app_beta_update_info_result setSuccess(AppBetaUpdateResult success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_app_beta_update_info_result(");
            sb2.append("success:");
            AppBetaUpdateResult appBetaUpdateResult = this.success;
            if (appBetaUpdateResult == null) {
                sb2.append("null");
            } else {
                sb2.append(appBetaUpdateResult);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            AppBetaUpdateResult appBetaUpdateResult = this.success;
            if (appBetaUpdateResult != null) {
                appBetaUpdateResult.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_app_beta_update_info_result(AppBetaUpdateResult success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_app_beta_update_info_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_app_beta_update_info_result, _Fields> deepCopy2() {
            return new get_app_beta_update_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_beta_update_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_beta_update_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_beta_update_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((AppBetaUpdateResult) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_app_beta_update_info_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_app_beta_update_info_result(get_app_beta_update_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new AppBetaUpdateResult(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_app_feedback_info_args implements TBase<get_app_feedback_info_args, _Fields>, Serializable, Cloneable, Comparable<get_app_feedback_info_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_app_feedback_info_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                return null;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_feedback_info_argsStandardScheme extends StandardScheme<get_app_feedback_info_args> {
            private get_app_feedback_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_app_feedback_info_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_app_feedback_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_app_feedback_info_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_feedback_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_app_feedback_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_feedback_info_argsStandardScheme getScheme() {
                return new get_app_feedback_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_feedback_info_argsTupleScheme extends TupleScheme<get_app_feedback_info_args> {
            private get_app_feedback_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_app_feedback_info_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_app_feedback_info_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_feedback_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_app_feedback_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_feedback_info_argsTupleScheme getScheme() {
                return new get_app_feedback_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_app_feedback_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_app_feedback_info_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_app_feedback_info_args.class, unmodifiableMap);
        }

        public get_app_feedback_info_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public boolean equals(get_app_feedback_info_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "get_app_feedback_info_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_app_feedback_info_args(get_app_feedback_info_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_app_feedback_info_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_app_feedback_info_args, _Fields> deepCopy2() {
            return new get_app_feedback_info_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_app_feedback_info_args)) {
                return equals((get_app_feedback_info_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_feedback_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_feedback_info_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_feedback_info_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_app_feedback_info_result implements TBase<get_app_feedback_info_result, _Fields>, Serializable, Cloneable, Comparable<get_app_feedback_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public Map<String, String> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_app_feedback_info_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 13, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_feedback_info_resultStandardScheme extends StandardScheme<get_app_feedback_info_result> {
            private get_app_feedback_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_app_feedback_info_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 13) {
                        TMap readMapBegin = iprot.readMapBegin();
                        struct.success = new HashMap(readMapBegin.size * 2);
                        for (int i11 = 0; i11 < readMapBegin.size; i11++) {
                            struct.success.put(iprot.readString(), iprot.readString());
                        }
                        iprot.readMapEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_app_feedback_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_app_feedback_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_app_feedback_info_result.SUCCESS_FIELD_DESC);
                    oprot.writeMapBegin(new TMap((byte) 11, (byte) 11, struct.success.size()));
                    for (Map.Entry<String, String> entry : struct.success.entrySet()) {
                        oprot.writeString(entry.getKey());
                        oprot.writeString(entry.getValue());
                    }
                    oprot.writeMapEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_app_feedback_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_app_feedback_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_feedback_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_app_feedback_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_feedback_info_resultStandardScheme getScheme() {
                return new get_app_feedback_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_feedback_info_resultTupleScheme extends TupleScheme<get_app_feedback_info_result> {
            private get_app_feedback_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_app_feedback_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TMap tMap = new TMap((byte) 11, (byte) 11, tTupleProtocol.readI32());
                    struct.success = new HashMap(tMap.size * 2);
                    for (int i11 = 0; i11 < tMap.size; i11++) {
                        struct.success.put(tTupleProtocol.readString(), tTupleProtocol.readString());
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_app_feedback_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    for (Map.Entry<String, String> entry : struct.success.entrySet()) {
                        tTupleProtocol.writeString(entry.getKey());
                        tTupleProtocol.writeString(entry.getValue());
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_feedback_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_app_feedback_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_feedback_info_resultTupleScheme getScheme() {
                return new get_app_feedback_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_app_feedback_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_app_feedback_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new MapMetaData((byte) 13, new FieldValueMetaData((byte) 11), new FieldValueMetaData((byte) 11))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_app_feedback_info_result.class, unmodifiableMap);
        }

        public get_app_feedback_info_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_app_feedback_info_result)) {
                return equals((get_app_feedback_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public Map<String, String> getSuccess() {
            return this.success;
        }

        public int getSuccessSize() {
            Map<String, String> map = this.success;
            if (map == null) {
                return 0;
            }
            return map.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        public void putToSuccess(String key, String val) {
            if (this.success == null) {
                this.success = new HashMap();
            }
            this.success.put(key, val);
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_app_feedback_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_app_feedback_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_app_feedback_info_result setSuccess(Map<String, String> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_app_feedback_info_result(");
            sb2.append("success:");
            Map<String, String> map = this.success;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_app_feedback_info_result(Map<String, String> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_app_feedback_info_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Map) this.success, (Map) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_app_feedback_info_result, _Fields> deepCopy2() {
            return new get_app_feedback_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_feedback_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_feedback_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_feedback_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((Map) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_app_feedback_info_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_app_feedback_info_result(get_app_feedback_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new HashMap(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_app_new_version_info_args implements TBase<get_app_new_version_info_args, _Fields>, Serializable, Cloneable, Comparable<get_app_new_version_info_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public AppBetaUpdateRequest request;
        private static final TStruct STRUCT_DESC = new TStruct("get_app_new_version_info_args");
        private static final TField REQUEST_FIELD_DESC = new TField(SocialConstants.TYPE_REQUEST, (byte) 12, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            REQUEST(1, SocialConstants.TYPE_REQUEST);

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId != 1) {
                    return null;
                }
                return REQUEST;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_new_version_info_argsStandardScheme extends StandardScheme<get_app_new_version_info_args> {
            private get_app_new_version_info_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_app_new_version_info_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 12) {
                        AppBetaUpdateRequest appBetaUpdateRequest = new AppBetaUpdateRequest();
                        struct.request = appBetaUpdateRequest;
                        appBetaUpdateRequest.read(iprot);
                        struct.setRequestIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_app_new_version_info_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_app_new_version_info_args.STRUCT_DESC);
                if (struct.request != null) {
                    oprot.writeFieldBegin(get_app_new_version_info_args.REQUEST_FIELD_DESC);
                    struct.request.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_new_version_info_argsStandardSchemeFactory implements SchemeFactory {
            private get_app_new_version_info_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_new_version_info_argsStandardScheme getScheme() {
                return new get_app_new_version_info_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_new_version_info_argsTupleScheme extends TupleScheme<get_app_new_version_info_args> {
            private get_app_new_version_info_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_app_new_version_info_args struct) throws TException {
                AppBetaUpdateRequest appBetaUpdateRequest = new AppBetaUpdateRequest();
                struct.request = appBetaUpdateRequest;
                appBetaUpdateRequest.read((TTupleProtocol) prot);
                struct.setRequestIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_app_new_version_info_args struct) throws TException {
                struct.request.write((TTupleProtocol) prot);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_new_version_info_argsTupleSchemeFactory implements SchemeFactory {
            private get_app_new_version_info_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_new_version_info_argsTupleScheme getScheme() {
                return new get_app_new_version_info_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_app_new_version_info_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_app_new_version_info_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.REQUEST, (_Fields) new FieldMetaData(SocialConstants.TYPE_REQUEST, (byte) 1, new StructMetaData((byte) 12, AppBetaUpdateRequest.class)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_app_new_version_info_args.class, unmodifiableMap);
        }

        public get_app_new_version_info_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.request = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_app_new_version_info_args)) {
                return equals((get_app_new_version_info_args) that);
            }
            return false;
        }

        public AppBetaUpdateRequest getRequest() {
            return this.request;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetRequest() {
            return this.request != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_app_new_version_info_args setRequest(AppBetaUpdateRequest request) {
            this.request = request;
            return this;
        }

        public void setRequestIsSet(boolean value) {
            if (value) {
                return;
            }
            this.request = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_app_new_version_info_args(");
            sb2.append("request:");
            AppBetaUpdateRequest appBetaUpdateRequest = this.request;
            if (appBetaUpdateRequest == null) {
                sb2.append("null");
            } else {
                sb2.append(appBetaUpdateRequest);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetRequest() {
            this.request = null;
        }

        public void validate() throws TException {
            AppBetaUpdateRequest appBetaUpdateRequest = this.request;
            if (appBetaUpdateRequest != null) {
                if (appBetaUpdateRequest != null) {
                    appBetaUpdateRequest.validate();
                }
            } else {
                throw new TProtocolException("Required field 'request' was not present! Struct: " + toString());
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_app_new_version_info_args(AppBetaUpdateRequest request) {
            this();
            this.request = request;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_app_new_version_info_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetRequest()).compareTo(Boolean.valueOf(other.isSetRequest()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetRequest() || (compareTo = TBaseHelper.compareTo((Comparable) this.request, (Comparable) other.request)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_app_new_version_info_args, _Fields> deepCopy2() {
            return new get_app_new_version_info_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_new_version_info_args$_Fields[field.ordinal()] == 1) {
                return getRequest();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_new_version_info_args$_Fields[field.ordinal()] == 1) {
                return isSetRequest();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_new_version_info_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetRequest();
            } else {
                setRequest((AppBetaUpdateRequest) value);
            }
        }

        public boolean equals(get_app_new_version_info_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetRequest = isSetRequest();
            boolean isSetRequest2 = that.isSetRequest();
            if (isSetRequest || isSetRequest2) {
                return isSetRequest && isSetRequest2 && this.request.equals(that.request);
            }
            return true;
        }

        public get_app_new_version_info_args(get_app_new_version_info_args other) {
            if (other.isSetRequest()) {
                this.request = new AppBetaUpdateRequest(other.request);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_app_new_version_info_result implements TBase<get_app_new_version_info_result, _Fields>, Serializable, Cloneable, Comparable<get_app_new_version_info_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public AppNewVersionResult success;
        private static final TStruct STRUCT_DESC = new TStruct("get_app_new_version_info_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_new_version_info_resultStandardScheme extends StandardScheme<get_app_new_version_info_result> {
            private get_app_new_version_info_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_app_new_version_info_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        AppNewVersionResult appNewVersionResult = new AppNewVersionResult();
                        struct.success = appNewVersionResult;
                        appNewVersionResult.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_app_new_version_info_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_app_new_version_info_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_app_new_version_info_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_app_new_version_info_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_app_new_version_info_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_new_version_info_resultStandardSchemeFactory implements SchemeFactory {
            private get_app_new_version_info_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_new_version_info_resultStandardScheme getScheme() {
                return new get_app_new_version_info_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_new_version_info_resultTupleScheme extends TupleScheme<get_app_new_version_info_result> {
            private get_app_new_version_info_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_app_new_version_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    AppNewVersionResult appNewVersionResult = new AppNewVersionResult();
                    struct.success = appNewVersionResult;
                    appNewVersionResult.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_app_new_version_info_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_app_new_version_info_resultTupleSchemeFactory implements SchemeFactory {
            private get_app_new_version_info_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_app_new_version_info_resultTupleScheme getScheme() {
                return new get_app_new_version_info_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_app_new_version_info_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_app_new_version_info_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, AppNewVersionResult.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_app_new_version_info_result.class, unmodifiableMap);
        }

        public get_app_new_version_info_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_app_new_version_info_result)) {
                return equals((get_app_new_version_info_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public AppNewVersionResult getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_app_new_version_info_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_app_new_version_info_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_app_new_version_info_result setSuccess(AppNewVersionResult success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_app_new_version_info_result(");
            sb2.append("success:");
            AppNewVersionResult appNewVersionResult = this.success;
            if (appNewVersionResult == null) {
                sb2.append("null");
            } else {
                sb2.append(appNewVersionResult);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            AppNewVersionResult appNewVersionResult = this.success;
            if (appNewVersionResult != null) {
                appNewVersionResult.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_app_new_version_info_result(AppNewVersionResult success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_app_new_version_info_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_app_new_version_info_result, _Fields> deepCopy2() {
            return new get_app_new_version_info_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_new_version_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_new_version_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_app_new_version_info_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((AppNewVersionResult) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_app_new_version_info_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_app_new_version_info_result(get_app_new_version_info_result other) {
            if (other.isSetSuccess()) {
                this.success = new AppNewVersionResult(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_domain_blacklist_args implements TBase<get_domain_blacklist_args, _Fields>, Serializable, Cloneable, Comparable<get_domain_blacklist_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_domain_blacklist_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                return null;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_blacklist_argsStandardScheme extends StandardScheme<get_domain_blacklist_args> {
            private get_domain_blacklist_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_domain_blacklist_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_domain_blacklist_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_domain_blacklist_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_blacklist_argsStandardSchemeFactory implements SchemeFactory {
            private get_domain_blacklist_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_domain_blacklist_argsStandardScheme getScheme() {
                return new get_domain_blacklist_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_blacklist_argsTupleScheme extends TupleScheme<get_domain_blacklist_args> {
            private get_domain_blacklist_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_domain_blacklist_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_domain_blacklist_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_blacklist_argsTupleSchemeFactory implements SchemeFactory {
            private get_domain_blacklist_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_domain_blacklist_argsTupleScheme getScheme() {
                return new get_domain_blacklist_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_domain_blacklist_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_domain_blacklist_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_domain_blacklist_args.class, unmodifiableMap);
        }

        public get_domain_blacklist_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public boolean equals(get_domain_blacklist_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "get_domain_blacklist_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_domain_blacklist_args(get_domain_blacklist_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_domain_blacklist_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_domain_blacklist_args, _Fields> deepCopy2() {
            return new get_domain_blacklist_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_domain_blacklist_args)) {
                return equals((get_domain_blacklist_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_blacklist_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_blacklist_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_blacklist_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_domain_blacklist_result implements TBase<get_domain_blacklist_result, _Fields>, Serializable, Cloneable, Comparable<get_domain_blacklist_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<String> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_domain_blacklist_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_blacklist_resultStandardScheme extends StandardScheme<get_domain_blacklist_result> {
            private get_domain_blacklist_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_domain_blacklist_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.success.add(iprot.readString());
                        }
                        iprot.readListEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_domain_blacklist_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_domain_blacklist_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_domain_blacklist_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 11, struct.success.size()));
                    Iterator<String> it = struct.success.iterator();
                    while (it.hasNext()) {
                        oprot.writeString(it.next());
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_domain_blacklist_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_domain_blacklist_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_blacklist_resultStandardSchemeFactory implements SchemeFactory {
            private get_domain_blacklist_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_domain_blacklist_resultStandardScheme getScheme() {
                return new get_domain_blacklist_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_blacklist_resultTupleScheme extends TupleScheme<get_domain_blacklist_result> {
            private get_domain_blacklist_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_domain_blacklist_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 11, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        struct.success.add(tTupleProtocol.readString());
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_domain_blacklist_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<String> it = struct.success.iterator();
                    while (it.hasNext()) {
                        tTupleProtocol.writeString(it.next());
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_blacklist_resultTupleSchemeFactory implements SchemeFactory {
            private get_domain_blacklist_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_domain_blacklist_resultTupleScheme getScheme() {
                return new get_domain_blacklist_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_domain_blacklist_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_domain_blacklist_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_domain_blacklist_result.class, unmodifiableMap);
        }

        public get_domain_blacklist_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public void addToSuccess(String elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_domain_blacklist_result)) {
                return equals((get_domain_blacklist_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<String> getSuccess() {
            return this.success;
        }

        public Iterator<String> getSuccessIterator() {
            List<String> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<String> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_domain_blacklist_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_domain_blacklist_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_domain_blacklist_result setSuccess(List<String> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_domain_blacklist_result(");
            sb2.append("success:");
            List<String> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_domain_blacklist_result(List<String> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_domain_blacklist_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((List) this.success, (List) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_domain_blacklist_result, _Fields> deepCopy2() {
            return new get_domain_blacklist_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_blacklist_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_blacklist_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_blacklist_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((List) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_domain_blacklist_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_domain_blacklist_result(get_domain_blacklist_result other) {
            if (other.isSetSuccess()) {
                this.success = new ArrayList(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_domain_whitelist_args implements TBase<get_domain_whitelist_args, _Fields>, Serializable, Cloneable, Comparable<get_domain_whitelist_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_domain_whitelist_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                return null;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_whitelist_argsStandardScheme extends StandardScheme<get_domain_whitelist_args> {
            private get_domain_whitelist_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_domain_whitelist_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_domain_whitelist_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_domain_whitelist_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_whitelist_argsStandardSchemeFactory implements SchemeFactory {
            private get_domain_whitelist_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_domain_whitelist_argsStandardScheme getScheme() {
                return new get_domain_whitelist_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_whitelist_argsTupleScheme extends TupleScheme<get_domain_whitelist_args> {
            private get_domain_whitelist_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_domain_whitelist_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_domain_whitelist_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_whitelist_argsTupleSchemeFactory implements SchemeFactory {
            private get_domain_whitelist_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_domain_whitelist_argsTupleScheme getScheme() {
                return new get_domain_whitelist_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_domain_whitelist_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_domain_whitelist_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_domain_whitelist_args.class, unmodifiableMap);
        }

        public get_domain_whitelist_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public boolean equals(get_domain_whitelist_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "get_domain_whitelist_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_domain_whitelist_args(get_domain_whitelist_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_domain_whitelist_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_domain_whitelist_args, _Fields> deepCopy2() {
            return new get_domain_whitelist_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_domain_whitelist_args)) {
                return equals((get_domain_whitelist_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_whitelist_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_whitelist_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_whitelist_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_domain_whitelist_result implements TBase<get_domain_whitelist_result, _Fields>, Serializable, Cloneable, Comparable<get_domain_whitelist_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<String> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_domain_whitelist_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_whitelist_resultStandardScheme extends StandardScheme<get_domain_whitelist_result> {
            private get_domain_whitelist_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_domain_whitelist_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.success.add(iprot.readString());
                        }
                        iprot.readListEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_domain_whitelist_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_domain_whitelist_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_domain_whitelist_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 11, struct.success.size()));
                    Iterator<String> it = struct.success.iterator();
                    while (it.hasNext()) {
                        oprot.writeString(it.next());
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_domain_whitelist_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_domain_whitelist_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_whitelist_resultStandardSchemeFactory implements SchemeFactory {
            private get_domain_whitelist_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_domain_whitelist_resultStandardScheme getScheme() {
                return new get_domain_whitelist_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_whitelist_resultTupleScheme extends TupleScheme<get_domain_whitelist_result> {
            private get_domain_whitelist_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_domain_whitelist_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 11, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        struct.success.add(tTupleProtocol.readString());
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_domain_whitelist_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<String> it = struct.success.iterator();
                    while (it.hasNext()) {
                        tTupleProtocol.writeString(it.next());
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_domain_whitelist_resultTupleSchemeFactory implements SchemeFactory {
            private get_domain_whitelist_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_domain_whitelist_resultTupleScheme getScheme() {
                return new get_domain_whitelist_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_domain_whitelist_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_domain_whitelist_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_domain_whitelist_result.class, unmodifiableMap);
        }

        public get_domain_whitelist_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public void addToSuccess(String elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_domain_whitelist_result)) {
                return equals((get_domain_whitelist_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<String> getSuccess() {
            return this.success;
        }

        public Iterator<String> getSuccessIterator() {
            List<String> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<String> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_domain_whitelist_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_domain_whitelist_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_domain_whitelist_result setSuccess(List<String> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_domain_whitelist_result(");
            sb2.append("success:");
            List<String> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_domain_whitelist_result(List<String> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_domain_whitelist_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((List) this.success, (List) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_domain_whitelist_result, _Fields> deepCopy2() {
            return new get_domain_whitelist_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_whitelist_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_whitelist_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_domain_whitelist_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((List) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_domain_whitelist_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_domain_whitelist_result(get_domain_whitelist_result other) {
            if (other.isSetSuccess()) {
                this.success = new ArrayList(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_guide_for_new_strategy_args implements TBase<get_guide_for_new_strategy_args, _Fields>, Serializable, Cloneable, Comparable<get_guide_for_new_strategy_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_guide_for_new_strategy_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                return null;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_guide_for_new_strategy_argsStandardScheme extends StandardScheme<get_guide_for_new_strategy_args> {
            private get_guide_for_new_strategy_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_guide_for_new_strategy_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_guide_for_new_strategy_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_guide_for_new_strategy_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_guide_for_new_strategy_argsStandardSchemeFactory implements SchemeFactory {
            private get_guide_for_new_strategy_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_guide_for_new_strategy_argsStandardScheme getScheme() {
                return new get_guide_for_new_strategy_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_guide_for_new_strategy_argsTupleScheme extends TupleScheme<get_guide_for_new_strategy_args> {
            private get_guide_for_new_strategy_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_guide_for_new_strategy_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_guide_for_new_strategy_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_guide_for_new_strategy_argsTupleSchemeFactory implements SchemeFactory {
            private get_guide_for_new_strategy_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_guide_for_new_strategy_argsTupleScheme getScheme() {
                return new get_guide_for_new_strategy_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_guide_for_new_strategy_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_guide_for_new_strategy_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_guide_for_new_strategy_args.class, unmodifiableMap);
        }

        public get_guide_for_new_strategy_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public boolean equals(get_guide_for_new_strategy_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "get_guide_for_new_strategy_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_guide_for_new_strategy_args(get_guide_for_new_strategy_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_guide_for_new_strategy_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_guide_for_new_strategy_args, _Fields> deepCopy2() {
            return new get_guide_for_new_strategy_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_guide_for_new_strategy_args)) {
                return equals((get_guide_for_new_strategy_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_guide_for_new_strategy_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_guide_for_new_strategy_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_guide_for_new_strategy_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_guide_for_new_strategy_result implements TBase<get_guide_for_new_strategy_result, _Fields>, Serializable, Cloneable, Comparable<get_guide_for_new_strategy_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public GuideForNewStrategy success;
        private static final TStruct STRUCT_DESC = new TStruct("get_guide_for_new_strategy_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_guide_for_new_strategy_resultStandardScheme extends StandardScheme<get_guide_for_new_strategy_result> {
            private get_guide_for_new_strategy_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_guide_for_new_strategy_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        GuideForNewStrategy guideForNewStrategy = new GuideForNewStrategy();
                        struct.success = guideForNewStrategy;
                        guideForNewStrategy.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_guide_for_new_strategy_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_guide_for_new_strategy_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_guide_for_new_strategy_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_guide_for_new_strategy_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_guide_for_new_strategy_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_guide_for_new_strategy_resultStandardSchemeFactory implements SchemeFactory {
            private get_guide_for_new_strategy_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_guide_for_new_strategy_resultStandardScheme getScheme() {
                return new get_guide_for_new_strategy_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_guide_for_new_strategy_resultTupleScheme extends TupleScheme<get_guide_for_new_strategy_result> {
            private get_guide_for_new_strategy_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_guide_for_new_strategy_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    GuideForNewStrategy guideForNewStrategy = new GuideForNewStrategy();
                    struct.success = guideForNewStrategy;
                    guideForNewStrategy.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_guide_for_new_strategy_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_guide_for_new_strategy_resultTupleSchemeFactory implements SchemeFactory {
            private get_guide_for_new_strategy_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_guide_for_new_strategy_resultTupleScheme getScheme() {
                return new get_guide_for_new_strategy_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_guide_for_new_strategy_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_guide_for_new_strategy_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, GuideForNewStrategy.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_guide_for_new_strategy_result.class, unmodifiableMap);
        }

        public get_guide_for_new_strategy_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_guide_for_new_strategy_result)) {
                return equals((get_guide_for_new_strategy_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public GuideForNewStrategy getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_guide_for_new_strategy_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_guide_for_new_strategy_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_guide_for_new_strategy_result setSuccess(GuideForNewStrategy success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_guide_for_new_strategy_result(");
            sb2.append("success:");
            GuideForNewStrategy guideForNewStrategy = this.success;
            if (guideForNewStrategy == null) {
                sb2.append("null");
            } else {
                sb2.append(guideForNewStrategy);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            GuideForNewStrategy guideForNewStrategy = this.success;
            if (guideForNewStrategy != null) {
                guideForNewStrategy.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_guide_for_new_strategy_result(GuideForNewStrategy success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_guide_for_new_strategy_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_guide_for_new_strategy_result, _Fields> deepCopy2() {
            return new get_guide_for_new_strategy_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_guide_for_new_strategy_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_guide_for_new_strategy_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_guide_for_new_strategy_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((GuideForNewStrategy) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_guide_for_new_strategy_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_guide_for_new_strategy_result(get_guide_for_new_strategy_result other) {
            if (other.isSetSuccess()) {
                this.success = new GuideForNewStrategy(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_privacy_agreement_version_args implements TBase<get_privacy_agreement_version_args, _Fields>, Serializable, Cloneable, Comparable<get_privacy_agreement_version_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_privacy_agreement_version_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                return null;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_privacy_agreement_version_argsStandardScheme extends StandardScheme<get_privacy_agreement_version_args> {
            private get_privacy_agreement_version_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_privacy_agreement_version_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_privacy_agreement_version_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_privacy_agreement_version_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_privacy_agreement_version_argsStandardSchemeFactory implements SchemeFactory {
            private get_privacy_agreement_version_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_privacy_agreement_version_argsStandardScheme getScheme() {
                return new get_privacy_agreement_version_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_privacy_agreement_version_argsTupleScheme extends TupleScheme<get_privacy_agreement_version_args> {
            private get_privacy_agreement_version_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_privacy_agreement_version_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_privacy_agreement_version_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_privacy_agreement_version_argsTupleSchemeFactory implements SchemeFactory {
            private get_privacy_agreement_version_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_privacy_agreement_version_argsTupleScheme getScheme() {
                return new get_privacy_agreement_version_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_privacy_agreement_version_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_privacy_agreement_version_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_privacy_agreement_version_args.class, unmodifiableMap);
        }

        public get_privacy_agreement_version_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public boolean equals(get_privacy_agreement_version_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "get_privacy_agreement_version_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_privacy_agreement_version_args(get_privacy_agreement_version_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_privacy_agreement_version_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_privacy_agreement_version_args, _Fields> deepCopy2() {
            return new get_privacy_agreement_version_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_privacy_agreement_version_args)) {
                return equals((get_privacy_agreement_version_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_privacy_agreement_version_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_privacy_agreement_version_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_privacy_agreement_version_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_privacy_agreement_version_result implements TBase<get_privacy_agreement_version_result, _Fields>, Serializable, Cloneable, Comparable<get_privacy_agreement_version_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public PrivacyAgreementInfo success;
        private static final TStruct STRUCT_DESC = new TStruct("get_privacy_agreement_version_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_privacy_agreement_version_resultStandardScheme extends StandardScheme<get_privacy_agreement_version_result> {
            private get_privacy_agreement_version_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_privacy_agreement_version_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        PrivacyAgreementInfo privacyAgreementInfo = new PrivacyAgreementInfo();
                        struct.success = privacyAgreementInfo;
                        privacyAgreementInfo.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_privacy_agreement_version_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_privacy_agreement_version_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_privacy_agreement_version_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_privacy_agreement_version_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_privacy_agreement_version_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_privacy_agreement_version_resultStandardSchemeFactory implements SchemeFactory {
            private get_privacy_agreement_version_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_privacy_agreement_version_resultStandardScheme getScheme() {
                return new get_privacy_agreement_version_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_privacy_agreement_version_resultTupleScheme extends TupleScheme<get_privacy_agreement_version_result> {
            private get_privacy_agreement_version_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_privacy_agreement_version_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    PrivacyAgreementInfo privacyAgreementInfo = new PrivacyAgreementInfo();
                    struct.success = privacyAgreementInfo;
                    privacyAgreementInfo.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_privacy_agreement_version_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_privacy_agreement_version_resultTupleSchemeFactory implements SchemeFactory {
            private get_privacy_agreement_version_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_privacy_agreement_version_resultTupleScheme getScheme() {
                return new get_privacy_agreement_version_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_privacy_agreement_version_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_privacy_agreement_version_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, PrivacyAgreementInfo.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_privacy_agreement_version_result.class, unmodifiableMap);
        }

        public get_privacy_agreement_version_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_privacy_agreement_version_result)) {
                return equals((get_privacy_agreement_version_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public PrivacyAgreementInfo getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_privacy_agreement_version_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_privacy_agreement_version_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_privacy_agreement_version_result setSuccess(PrivacyAgreementInfo success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_privacy_agreement_version_result(");
            sb2.append("success:");
            PrivacyAgreementInfo privacyAgreementInfo = this.success;
            if (privacyAgreementInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(privacyAgreementInfo);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            PrivacyAgreementInfo privacyAgreementInfo = this.success;
            if (privacyAgreementInfo != null) {
                privacyAgreementInfo.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_privacy_agreement_version_result(PrivacyAgreementInfo success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_privacy_agreement_version_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_privacy_agreement_version_result, _Fields> deepCopy2() {
            return new get_privacy_agreement_version_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_privacy_agreement_version_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_privacy_agreement_version_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_privacy_agreement_version_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((PrivacyAgreementInfo) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_privacy_agreement_version_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_privacy_agreement_version_result(get_privacy_agreement_version_result other) {
            if (other.isSetSuccess()) {
                this.success = new PrivacyAgreementInfo(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_static_config_args implements TBase<get_static_config_args, _Fields>, Serializable, Cloneable, Comparable<get_static_config_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_static_config_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                return null;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_static_config_argsStandardScheme extends StandardScheme<get_static_config_args> {
            private get_static_config_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_static_config_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_static_config_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_static_config_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_static_config_argsStandardSchemeFactory implements SchemeFactory {
            private get_static_config_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_static_config_argsStandardScheme getScheme() {
                return new get_static_config_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_static_config_argsTupleScheme extends TupleScheme<get_static_config_args> {
            private get_static_config_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_static_config_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_static_config_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_static_config_argsTupleSchemeFactory implements SchemeFactory {
            private get_static_config_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_static_config_argsTupleScheme getScheme() {
                return new get_static_config_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_static_config_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_static_config_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_static_config_args.class, unmodifiableMap);
        }

        public get_static_config_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public boolean equals(get_static_config_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "get_static_config_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_static_config_args(get_static_config_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_static_config_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_static_config_args, _Fields> deepCopy2() {
            return new get_static_config_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_static_config_args)) {
                return equals((get_static_config_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_static_config_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_static_config_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_static_config_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_static_config_result implements TBase<get_static_config_result, _Fields>, Serializable, Cloneable, Comparable<get_static_config_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public List<StaticConfig> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_static_config_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 15, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_static_config_resultStandardScheme extends StandardScheme<get_static_config_result> {
            private get_static_config_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_static_config_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.success = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            StaticConfig staticConfig = new StaticConfig();
                            staticConfig.read(iprot);
                            struct.success.add(staticConfig);
                        }
                        iprot.readListEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_static_config_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_static_config_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_static_config_result.SUCCESS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 12, struct.success.size()));
                    Iterator<StaticConfig> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_static_config_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_static_config_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_static_config_resultStandardSchemeFactory implements SchemeFactory {
            private get_static_config_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_static_config_resultStandardScheme getScheme() {
                return new get_static_config_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_static_config_resultTupleScheme extends TupleScheme<get_static_config_result> {
            private get_static_config_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_static_config_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                    struct.success = new ArrayList(tList.size);
                    for (int i11 = 0; i11 < tList.size; i11++) {
                        StaticConfig staticConfig = new StaticConfig();
                        staticConfig.read(tTupleProtocol);
                        struct.success.add(staticConfig);
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_static_config_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    Iterator<StaticConfig> it = struct.success.iterator();
                    while (it.hasNext()) {
                        it.next().write(tTupleProtocol);
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_static_config_resultTupleSchemeFactory implements SchemeFactory {
            private get_static_config_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_static_config_resultTupleScheme getScheme() {
                return new get_static_config_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_static_config_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_static_config_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new ListMetaData((byte) 15, new StructMetaData((byte) 12, StaticConfig.class))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_static_config_result.class, unmodifiableMap);
        }

        public get_static_config_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public void addToSuccess(StaticConfig elem) {
            if (this.success == null) {
                this.success = new ArrayList();
            }
            this.success.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_static_config_result)) {
                return equals((get_static_config_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public List<StaticConfig> getSuccess() {
            return this.success;
        }

        public Iterator<StaticConfig> getSuccessIterator() {
            List<StaticConfig> list = this.success;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getSuccessSize() {
            List<StaticConfig> list = this.success;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_static_config_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_static_config_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_static_config_result setSuccess(List<StaticConfig> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_static_config_result(");
            sb2.append("success:");
            List<StaticConfig> list = this.success;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_static_config_result(List<StaticConfig> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_static_config_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((List) this.success, (List) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_static_config_result, _Fields> deepCopy2() {
            return new get_static_config_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_static_config_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_static_config_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_static_config_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((List) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_static_config_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_static_config_result(get_static_config_result other) {
            if (other.isSetSuccess()) {
                ArrayList arrayList = new ArrayList(other.success.size());
                Iterator<StaticConfig> it = other.success.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StaticConfig(it.next()));
                }
                this.success = arrayList;
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_switches_args implements TBase<get_switches_args, _Fields>, Serializable, Cloneable, Comparable<get_switches_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_switches_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                return null;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_switches_argsStandardScheme extends StandardScheme<get_switches_args> {
            private get_switches_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_switches_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_switches_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_switches_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_switches_argsStandardSchemeFactory implements SchemeFactory {
            private get_switches_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_switches_argsStandardScheme getScheme() {
                return new get_switches_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_switches_argsTupleScheme extends TupleScheme<get_switches_args> {
            private get_switches_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_switches_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_switches_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_switches_argsTupleSchemeFactory implements SchemeFactory {
            private get_switches_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_switches_argsTupleScheme getScheme() {
                return new get_switches_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_switches_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_switches_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_switches_args.class, unmodifiableMap);
        }

        public get_switches_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public boolean equals(get_switches_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "get_switches_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_switches_args(get_switches_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_switches_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_switches_args, _Fields> deepCopy2() {
            return new get_switches_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_switches_args)) {
                return equals((get_switches_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_switches_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_switches_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_switches_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_switches_result implements TBase<get_switches_result, _Fields>, Serializable, Cloneable, Comparable<get_switches_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public BczAppSwitch success;
        private static final TStruct STRUCT_DESC = new TStruct("get_switches_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_switches_resultStandardScheme extends StandardScheme<get_switches_result> {
            private get_switches_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_switches_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        BczAppSwitch bczAppSwitch = new BczAppSwitch();
                        struct.success = bczAppSwitch;
                        bczAppSwitch.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_switches_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_switches_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_switches_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_switches_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_switches_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_switches_resultStandardSchemeFactory implements SchemeFactory {
            private get_switches_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_switches_resultStandardScheme getScheme() {
                return new get_switches_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_switches_resultTupleScheme extends TupleScheme<get_switches_result> {
            private get_switches_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_switches_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    BczAppSwitch bczAppSwitch = new BczAppSwitch();
                    struct.success = bczAppSwitch;
                    bczAppSwitch.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_switches_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_switches_resultTupleSchemeFactory implements SchemeFactory {
            private get_switches_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_switches_resultTupleScheme getScheme() {
                return new get_switches_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_switches_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_switches_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, BczAppSwitch.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_switches_result.class, unmodifiableMap);
        }

        public get_switches_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_switches_result)) {
                return equals((get_switches_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public BczAppSwitch getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_switches_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_switches_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_switches_result setSuccess(BczAppSwitch success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_switches_result(");
            sb2.append("success:");
            BczAppSwitch bczAppSwitch = this.success;
            if (bczAppSwitch == null) {
                sb2.append("null");
            } else {
                sb2.append(bczAppSwitch);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            BczAppSwitch bczAppSwitch = this.success;
            if (bczAppSwitch != null) {
                bczAppSwitch.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_switches_result(BczAppSwitch success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_switches_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_switches_result, _Fields> deepCopy2() {
            return new get_switches_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_switches_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_switches_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_switches_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((BczAppSwitch) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_switches_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_switches_result(get_switches_result other) {
            if (other.isSetSuccess()) {
                this.success = new BczAppSwitch(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_test_flags_args implements TBase<get_test_flags_args, _Fields>, Serializable, Cloneable, Comparable<get_test_flags_args> {
        private static final TStruct STRUCT_DESC = new TStruct("get_test_flags_args");
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            ;

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                return null;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_test_flags_argsStandardScheme extends StandardScheme<get_test_flags_args> {
            private get_test_flags_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_test_flags_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    byte b11 = iprot.readFieldBegin().type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                        iprot.readFieldEnd();
                    }
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_test_flags_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_test_flags_args.STRUCT_DESC);
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_test_flags_argsStandardSchemeFactory implements SchemeFactory {
            private get_test_flags_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_test_flags_argsStandardScheme getScheme() {
                return new get_test_flags_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_test_flags_argsTupleScheme extends TupleScheme<get_test_flags_args> {
            private get_test_flags_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_test_flags_args struct) throws TException {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_test_flags_args struct) throws TException {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_test_flags_argsTupleSchemeFactory implements SchemeFactory {
            private get_test_flags_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_test_flags_argsTupleScheme getScheme() {
                return new get_test_flags_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_test_flags_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_test_flags_argsTupleSchemeFactory());
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_test_flags_args.class, unmodifiableMap);
        }

        public get_test_flags_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public boolean equals(get_test_flags_args that) {
            return that != null;
        }

        public int hashCode() {
            return 0;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public String toString() {
            return "get_test_flags_args(" + pn.j.f81007d;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_test_flags_args(get_test_flags_args other) {
        }

        @Override // java.lang.Comparable
        public int compareTo(get_test_flags_args other) {
            if (getClass().equals(other.getClass())) {
                return 0;
            }
            return getClass().getName().compareTo(other.getClass().getName());
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_test_flags_args, _Fields> deepCopy2() {
            return new get_test_flags_args(this);
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_test_flags_args)) {
                return equals((get_test_flags_args) that);
            }
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_test_flags_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_test_flags_args$_Fields[field.ordinal()];
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_test_flags_args$_Fields[field.ordinal()];
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class get_test_flags_result implements TBase<get_test_flags_result, _Fields>, Serializable, Cloneable, Comparable<get_test_flags_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public Map<String, Integer> success;
        private static final TStruct STRUCT_DESC = new TStruct("get_test_flags_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 13, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_test_flags_resultStandardScheme extends StandardScheme<get_test_flags_result> {
            private get_test_flags_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, get_test_flags_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 13) {
                        TMap readMapBegin = iprot.readMapBegin();
                        struct.success = new HashMap(readMapBegin.size * 2);
                        for (int i11 = 0; i11 < readMapBegin.size; i11++) {
                            struct.success.put(iprot.readString(), Integer.valueOf(iprot.readI32()));
                        }
                        iprot.readMapEnd();
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, get_test_flags_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(get_test_flags_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(get_test_flags_result.SUCCESS_FIELD_DESC);
                    oprot.writeMapBegin(new TMap((byte) 11, (byte) 8, struct.success.size()));
                    for (Map.Entry<String, Integer> entry : struct.success.entrySet()) {
                        oprot.writeString(entry.getKey());
                        oprot.writeI32(entry.getValue().intValue());
                    }
                    oprot.writeMapEnd();
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(get_test_flags_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(get_test_flags_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_test_flags_resultStandardSchemeFactory implements SchemeFactory {
            private get_test_flags_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_test_flags_resultStandardScheme getScheme() {
                return new get_test_flags_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_test_flags_resultTupleScheme extends TupleScheme<get_test_flags_result> {
            private get_test_flags_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, get_test_flags_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    TMap tMap = new TMap((byte) 11, (byte) 8, tTupleProtocol.readI32());
                    struct.success = new HashMap(tMap.size * 2);
                    for (int i11 = 0; i11 < tMap.size; i11++) {
                        struct.success.put(tTupleProtocol.readString(), Integer.valueOf(tTupleProtocol.readI32()));
                    }
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, get_test_flags_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    tTupleProtocol.writeI32(struct.success.size());
                    for (Map.Entry<String, Integer> entry : struct.success.entrySet()) {
                        tTupleProtocol.writeString(entry.getKey());
                        tTupleProtocol.writeI32(entry.getValue().intValue());
                    }
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class get_test_flags_resultTupleSchemeFactory implements SchemeFactory {
            private get_test_flags_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public get_test_flags_resultTupleScheme getScheme() {
                return new get_test_flags_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new get_test_flags_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new get_test_flags_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new MapMetaData((byte) 13, new FieldValueMetaData((byte) 11), new FieldValueMetaData((byte) 8))));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(get_test_flags_result.class, unmodifiableMap);
        }

        public get_test_flags_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof get_test_flags_result)) {
                return equals((get_test_flags_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public Map<String, Integer> getSuccess() {
            return this.success;
        }

        public int getSuccessSize() {
            Map<String, Integer> map = this.success;
            if (map == null) {
                return 0;
            }
            return map.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        public void putToSuccess(String key, int val) {
            if (this.success == null) {
                this.success = new HashMap();
            }
            this.success.put(key, Integer.valueOf(val));
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public get_test_flags_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public get_test_flags_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public get_test_flags_result setSuccess(Map<String, Integer> success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("get_test_flags_result(");
            sb2.append("success:");
            Map<String, Integer> map = this.success;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public get_test_flags_result(Map<String, Integer> success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(get_test_flags_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Map) this.success, (Map) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<get_test_flags_result, _Fields> deepCopy2() {
            return new get_test_flags_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_test_flags_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_test_flags_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$get_test_flags_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((Map) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(get_test_flags_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public get_test_flags_result(get_test_flags_result other) {
            if (other.isSetSuccess()) {
                this.success = new HashMap(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class qrcode_scan_args implements TBase<qrcode_scan_args, _Fields>, Serializable, Cloneable, Comparable<qrcode_scan_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public String qrcode;
        private static final TStruct STRUCT_DESC = new TStruct("qrcode_scan_args");
        private static final TField QRCODE_FIELD_DESC = new TField("qrcode", (byte) 11, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            QRCODE(1, "qrcode");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId != 1) {
                    return null;
                }
                return QRCODE;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_argsStandardScheme extends StandardScheme<qrcode_scan_args> {
            private qrcode_scan_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, qrcode_scan_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.qrcode = iprot.readString();
                        struct.setQrcodeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, qrcode_scan_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(qrcode_scan_args.STRUCT_DESC);
                if (struct.qrcode != null) {
                    oprot.writeFieldBegin(qrcode_scan_args.QRCODE_FIELD_DESC);
                    oprot.writeString(struct.qrcode);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_argsStandardSchemeFactory implements SchemeFactory {
            private qrcode_scan_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public qrcode_scan_argsStandardScheme getScheme() {
                return new qrcode_scan_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_argsTupleScheme extends TupleScheme<qrcode_scan_args> {
            private qrcode_scan_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, qrcode_scan_args struct) throws TException {
                struct.qrcode = ((TTupleProtocol) prot).readString();
                struct.setQrcodeIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, qrcode_scan_args struct) throws TException {
                ((TTupleProtocol) prot).writeString(struct.qrcode);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_argsTupleSchemeFactory implements SchemeFactory {
            private qrcode_scan_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public qrcode_scan_argsTupleScheme getScheme() {
                return new qrcode_scan_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new qrcode_scan_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new qrcode_scan_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.QRCODE, (_Fields) new FieldMetaData("qrcode", (byte) 1, new FieldValueMetaData((byte) 11)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(qrcode_scan_args.class, unmodifiableMap);
        }

        public qrcode_scan_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.qrcode = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof qrcode_scan_args)) {
                return equals((qrcode_scan_args) that);
            }
            return false;
        }

        public String getQrcode() {
            return this.qrcode;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetQrcode() {
            return this.qrcode != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public qrcode_scan_args setQrcode(String qrcode) {
            this.qrcode = qrcode;
            return this;
        }

        public void setQrcodeIsSet(boolean value) {
            if (value) {
                return;
            }
            this.qrcode = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("qrcode_scan_args(");
            sb2.append("qrcode:");
            String str = this.qrcode;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetQrcode() {
            this.qrcode = null;
        }

        public void validate() throws TException {
            if (this.qrcode != null) {
                return;
            }
            throw new TProtocolException("Required field 'qrcode' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public qrcode_scan_args(String qrcode) {
            this();
            this.qrcode = qrcode;
        }

        @Override // java.lang.Comparable
        public int compareTo(qrcode_scan_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetQrcode()).compareTo(Boolean.valueOf(other.isSetQrcode()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetQrcode() || (compareTo = TBaseHelper.compareTo(this.qrcode, other.qrcode)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<qrcode_scan_args, _Fields> deepCopy2() {
            return new qrcode_scan_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$qrcode_scan_args$_Fields[field.ordinal()] == 1) {
                return getQrcode();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$qrcode_scan_args$_Fields[field.ordinal()] == 1) {
                return isSetQrcode();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$qrcode_scan_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetQrcode();
            } else {
                setQrcode((String) value);
            }
        }

        public boolean equals(qrcode_scan_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetQrcode = isSetQrcode();
            boolean isSetQrcode2 = that.isSetQrcode();
            if (isSetQrcode || isSetQrcode2) {
                return isSetQrcode && isSetQrcode2 && this.qrcode.equals(that.qrcode);
            }
            return true;
        }

        public qrcode_scan_args(qrcode_scan_args other) {
            if (other.isSetQrcode()) {
                this.qrcode = other.qrcode;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class qrcode_scan_result implements TBase<qrcode_scan_result, _Fields>, Serializable, Cloneable, Comparable<qrcode_scan_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        public QRCodeResp success;
        private static final TStruct STRUCT_DESC = new TStruct("qrcode_scan_result");
        private static final TField SUCCESS_FIELD_DESC = new TField("success", (byte) 12, 0);
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            SUCCESS(0, "success"),
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 0) {
                    return SUCCESS;
                }
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_resultStandardScheme extends StandardScheme<qrcode_scan_result> {
            private qrcode_scan_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, qrcode_scan_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 0) {
                        if (s11 != 1) {
                            if (s11 != 2) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                LogicException logicException = new LogicException();
                                struct.bomb = logicException;
                                logicException.read(iprot);
                                struct.setBombIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            SystemException systemException = new SystemException();
                            struct.boom = systemException;
                            systemException.read(iprot);
                            struct.setBoomIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        QRCodeResp qRCodeResp = new QRCodeResp();
                        struct.success = qRCodeResp;
                        qRCodeResp.read(iprot);
                        struct.setSuccessIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, qrcode_scan_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(qrcode_scan_result.STRUCT_DESC);
                if (struct.success != null) {
                    oprot.writeFieldBegin(qrcode_scan_result.SUCCESS_FIELD_DESC);
                    struct.success.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.boom != null) {
                    oprot.writeFieldBegin(qrcode_scan_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(qrcode_scan_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_resultStandardSchemeFactory implements SchemeFactory {
            private qrcode_scan_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public qrcode_scan_resultStandardScheme getScheme() {
                return new qrcode_scan_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_resultTupleScheme extends TupleScheme<qrcode_scan_result> {
            private qrcode_scan_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, qrcode_scan_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(3);
                if (readBitSet.get(0)) {
                    QRCodeResp qRCodeResp = new QRCodeResp();
                    struct.success = qRCodeResp;
                    qRCodeResp.read(tTupleProtocol);
                    struct.setSuccessIsSet(true);
                }
                if (readBitSet.get(1)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(2)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, qrcode_scan_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetSuccess()) {
                    bitSet.set(0);
                }
                if (struct.isSetBoom()) {
                    bitSet.set(1);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(2);
                }
                tTupleProtocol.writeBitSet(bitSet, 3);
                if (struct.isSetSuccess()) {
                    struct.success.write(tTupleProtocol);
                }
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class qrcode_scan_resultTupleSchemeFactory implements SchemeFactory {
            private qrcode_scan_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public qrcode_scan_resultTupleScheme getScheme() {
                return new qrcode_scan_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new qrcode_scan_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new qrcode_scan_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.SUCCESS, (_Fields) new FieldMetaData("success", (byte) 3, new StructMetaData((byte) 12, QRCodeResp.class)));
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(qrcode_scan_result.class, unmodifiableMap);
        }

        public qrcode_scan_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.success = null;
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof qrcode_scan_result)) {
                return equals((qrcode_scan_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public QRCodeResp getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        public boolean isSetSuccess() {
            return this.success != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public qrcode_scan_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public qrcode_scan_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public qrcode_scan_result setSuccess(QRCodeResp success) {
            this.success = success;
            return this;
        }

        public void setSuccessIsSet(boolean value) {
            if (value) {
                return;
            }
            this.success = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("qrcode_scan_result(");
            sb2.append("success:");
            QRCodeResp qRCodeResp = this.success;
            if (qRCodeResp == null) {
                sb2.append("null");
            } else {
                sb2.append(qRCodeResp);
            }
            sb2.append(j2.O);
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        public void unsetSuccess() {
            this.success = null;
        }

        public void validate() throws TException {
            QRCodeResp qRCodeResp = this.success;
            if (qRCodeResp != null) {
                qRCodeResp.validate();
            }
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public qrcode_scan_result(QRCodeResp success, SystemException boom, LogicException bomb) {
            this();
            this.success = success;
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(qrcode_scan_result other) {
            int compareTo;
            int compareTo2;
            int compareTo3;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo4 = Boolean.valueOf(isSetSuccess()).compareTo(Boolean.valueOf(other.isSetSuccess()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (isSetSuccess() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.success, (Comparable) other.success)) != 0) {
                return compareTo3;
            }
            int compareTo5 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo5 != 0) {
                return compareTo5;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo6 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo6 != 0) {
                return compareTo6;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<qrcode_scan_result, _Fields> deepCopy2() {
            return new qrcode_scan_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$qrcode_scan_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getSuccess();
            }
            if (i11 == 2) {
                return getBoom();
            }
            if (i11 == 3) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$qrcode_scan_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetSuccess();
            }
            if (i11 == 2) {
                return isSetBoom();
            }
            if (i11 == 3) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$qrcode_scan_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetSuccess();
                    return;
                } else {
                    setSuccess((QRCodeResp) value);
                    return;
                }
            }
            if (i11 == 2) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(qrcode_scan_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetSuccess = isSetSuccess();
            boolean isSetSuccess2 = that.isSetSuccess();
            if ((isSetSuccess || isSetSuccess2) && !(isSetSuccess && isSetSuccess2 && this.success.equals(that.success))) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public qrcode_scan_result(qrcode_scan_result other) {
            if (other.isSetSuccess()) {
                this.success = new QRCodeResp(other.success);
            }
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class report_event_args implements TBase<report_event_args, _Fields>, Serializable, Cloneable, Comparable<report_event_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public List<String> jsons;
        private static final TStruct STRUCT_DESC = new TStruct("report_event_args");
        private static final TField JSONS_FIELD_DESC = new TField("jsons", (byte) 15, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            JSONS(1, "jsons");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId != 1) {
                    return null;
                }
                return JSONS;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_argsStandardScheme extends StandardScheme<report_event_args> {
            private report_event_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, report_event_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.jsons = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.jsons.add(iprot.readString());
                        }
                        iprot.readListEnd();
                        struct.setJsonsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, report_event_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(report_event_args.STRUCT_DESC);
                if (struct.jsons != null) {
                    oprot.writeFieldBegin(report_event_args.JSONS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 11, struct.jsons.size()));
                    Iterator<String> it = struct.jsons.iterator();
                    while (it.hasNext()) {
                        oprot.writeString(it.next());
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_argsStandardSchemeFactory implements SchemeFactory {
            private report_event_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public report_event_argsStandardScheme getScheme() {
                return new report_event_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_argsTupleScheme extends TupleScheme<report_event_args> {
            private report_event_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, report_event_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                TList tList = new TList((byte) 11, tTupleProtocol.readI32());
                struct.jsons = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    struct.jsons.add(tTupleProtocol.readString());
                }
                struct.setJsonsIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, report_event_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.jsons.size());
                Iterator<String> it = struct.jsons.iterator();
                while (it.hasNext()) {
                    tTupleProtocol.writeString(it.next());
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_argsTupleSchemeFactory implements SchemeFactory {
            private report_event_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public report_event_argsTupleScheme getScheme() {
                return new report_event_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new report_event_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new report_event_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.JSONS, (_Fields) new FieldMetaData("jsons", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(report_event_args.class, unmodifiableMap);
        }

        public report_event_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public void addToJsons(String elem) {
            if (this.jsons == null) {
                this.jsons = new ArrayList();
            }
            this.jsons.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.jsons = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof report_event_args)) {
                return equals((report_event_args) that);
            }
            return false;
        }

        public List<String> getJsons() {
            return this.jsons;
        }

        public Iterator<String> getJsonsIterator() {
            List<String> list = this.jsons;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getJsonsSize() {
            List<String> list = this.jsons;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetJsons() {
            return this.jsons != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public report_event_args setJsons(List<String> jsons) {
            this.jsons = jsons;
            return this;
        }

        public void setJsonsIsSet(boolean value) {
            if (value) {
                return;
            }
            this.jsons = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("report_event_args(");
            sb2.append("jsons:");
            List<String> list = this.jsons;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetJsons() {
            this.jsons = null;
        }

        public void validate() throws TException {
            if (this.jsons != null) {
                return;
            }
            throw new TProtocolException("Required field 'jsons' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public report_event_args(List<String> jsons) {
            this();
            this.jsons = jsons;
        }

        @Override // java.lang.Comparable
        public int compareTo(report_event_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetJsons()).compareTo(Boolean.valueOf(other.isSetJsons()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetJsons() || (compareTo = TBaseHelper.compareTo((List) this.jsons, (List) other.jsons)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<report_event_args, _Fields> deepCopy2() {
            return new report_event_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_args$_Fields[field.ordinal()] == 1) {
                return getJsons();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_args$_Fields[field.ordinal()] == 1) {
                return isSetJsons();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetJsons();
            } else {
                setJsons((List) value);
            }
        }

        public boolean equals(report_event_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetJsons = isSetJsons();
            boolean isSetJsons2 = that.isSetJsons();
            if (isSetJsons || isSetJsons2) {
                return isSetJsons && isSetJsons2 && this.jsons.equals(that.jsons);
            }
            return true;
        }

        public report_event_args(report_event_args other) {
            if (other.isSetJsons()) {
                this.jsons = new ArrayList(other.jsons);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class report_event_result implements TBase<report_event_result, _Fields>, Serializable, Cloneable, Comparable<report_event_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("report_event_result");
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_resultStandardScheme extends StandardScheme<report_event_result> {
            private report_event_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, report_event_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 1) {
                        if (s11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 12) {
                            LogicException logicException = new LogicException();
                            struct.bomb = logicException;
                            logicException.read(iprot);
                            struct.setBombIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        SystemException systemException = new SystemException();
                        struct.boom = systemException;
                        systemException.read(iprot);
                        struct.setBoomIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, report_event_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(report_event_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(report_event_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(report_event_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_resultStandardSchemeFactory implements SchemeFactory {
            private report_event_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public report_event_resultStandardScheme getScheme() {
                return new report_event_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_resultTupleScheme extends TupleScheme<report_event_result> {
            private report_event_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, report_event_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(2);
                if (readBitSet.get(0)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(1)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, report_event_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetBoom()) {
                    bitSet.set(0);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_resultTupleSchemeFactory implements SchemeFactory {
            private report_event_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public report_event_resultTupleScheme getScheme() {
                return new report_event_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new report_event_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new report_event_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(report_event_result.class, unmodifiableMap);
        }

        public report_event_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof report_event_result)) {
                return equals((report_event_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public report_event_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public report_event_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("report_event_result(");
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public report_event_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(report_event_result other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<report_event_result, _Fields> deepCopy2() {
            return new report_event_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getBoom();
            }
            if (i11 == 2) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetBoom();
            }
            if (i11 == 2) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(report_event_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public report_event_result(report_event_result other) {
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class report_event_without_login_args implements TBase<report_event_without_login_args, _Fields>, Serializable, Cloneable, Comparable<report_event_without_login_args> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public List<String> jsons;
        private static final TStruct STRUCT_DESC = new TStruct("report_event_without_login_args");
        private static final TField JSONS_FIELD_DESC = new TField("jsons", (byte) 15, 1);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            JSONS(1, "jsons");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId != 1) {
                    return null;
                }
                return JSONS;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_without_login_argsStandardScheme extends StandardScheme<report_event_without_login_args> {
            private report_event_without_login_argsStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, report_event_without_login_args struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    if (readFieldBegin.f77768id != 1) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.jsons = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.jsons.add(iprot.readString());
                        }
                        iprot.readListEnd();
                        struct.setJsonsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, report_event_without_login_args struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(report_event_without_login_args.STRUCT_DESC);
                if (struct.jsons != null) {
                    oprot.writeFieldBegin(report_event_without_login_args.JSONS_FIELD_DESC);
                    oprot.writeListBegin(new TList((byte) 11, struct.jsons.size()));
                    Iterator<String> it = struct.jsons.iterator();
                    while (it.hasNext()) {
                        oprot.writeString(it.next());
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_without_login_argsStandardSchemeFactory implements SchemeFactory {
            private report_event_without_login_argsStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public report_event_without_login_argsStandardScheme getScheme() {
                return new report_event_without_login_argsStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_without_login_argsTupleScheme extends TupleScheme<report_event_without_login_args> {
            private report_event_without_login_argsTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, report_event_without_login_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                TList tList = new TList((byte) 11, tTupleProtocol.readI32());
                struct.jsons = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    struct.jsons.add(tTupleProtocol.readString());
                }
                struct.setJsonsIsSet(true);
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, report_event_without_login_args struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                tTupleProtocol.writeI32(struct.jsons.size());
                Iterator<String> it = struct.jsons.iterator();
                while (it.hasNext()) {
                    tTupleProtocol.writeString(it.next());
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_without_login_argsTupleSchemeFactory implements SchemeFactory {
            private report_event_without_login_argsTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public report_event_without_login_argsTupleScheme getScheme() {
                return new report_event_without_login_argsTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new report_event_without_login_argsStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new report_event_without_login_argsTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.JSONS, (_Fields) new FieldMetaData("jsons", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(report_event_without_login_args.class, unmodifiableMap);
        }

        public report_event_without_login_args() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        public void addToJsons(String elem) {
            if (this.jsons == null) {
                this.jsons = new ArrayList();
            }
            this.jsons.add(elem);
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.jsons = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof report_event_without_login_args)) {
                return equals((report_event_without_login_args) that);
            }
            return false;
        }

        public List<String> getJsons() {
            return this.jsons;
        }

        public Iterator<String> getJsonsIterator() {
            List<String> list = this.jsons;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public int getJsonsSize() {
            List<String> list = this.jsons;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetJsons() {
            return this.jsons != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public report_event_without_login_args setJsons(List<String> jsons) {
            this.jsons = jsons;
            return this;
        }

        public void setJsonsIsSet(boolean value) {
            if (value) {
                return;
            }
            this.jsons = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("report_event_without_login_args(");
            sb2.append("jsons:");
            List<String> list = this.jsons;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetJsons() {
            this.jsons = null;
        }

        public void validate() throws TException {
            if (this.jsons != null) {
                return;
            }
            throw new TProtocolException("Required field 'jsons' was not present! Struct: " + toString());
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public report_event_without_login_args(List<String> jsons) {
            this();
            this.jsons = jsons;
        }

        @Override // java.lang.Comparable
        public int compareTo(report_event_without_login_args other) {
            int compareTo;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo2 = Boolean.valueOf(isSetJsons()).compareTo(Boolean.valueOf(other.isSetJsons()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            if (!isSetJsons() || (compareTo = TBaseHelper.compareTo((List) this.jsons, (List) other.jsons)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<report_event_without_login_args, _Fields> deepCopy2() {
            return new report_event_without_login_args(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_without_login_args$_Fields[field.ordinal()] == 1) {
                return getJsons();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_without_login_args$_Fields[field.ordinal()] == 1) {
                return isSetJsons();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_without_login_args$_Fields[field.ordinal()] != 1) {
                return;
            }
            if (value == null) {
                unsetJsons();
            } else {
                setJsons((List) value);
            }
        }

        public boolean equals(report_event_without_login_args that) {
            if (that == null) {
                return false;
            }
            boolean isSetJsons = isSetJsons();
            boolean isSetJsons2 = that.isSetJsons();
            if (isSetJsons || isSetJsons2) {
                return isSetJsons && isSetJsons2 && this.jsons.equals(that.jsons);
            }
            return true;
        }

        public report_event_without_login_args(report_event_without_login_args other) {
            if (other.isSetJsons()) {
                this.jsons = new ArrayList(other.jsons);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class report_event_without_login_result implements TBase<report_event_without_login_result, _Fields>, Serializable, Cloneable, Comparable<report_event_without_login_result> {
        public static final Map<_Fields, FieldMetaData> metaDataMap;
        private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
        public LogicException bomb;
        public SystemException boom;
        private static final TStruct STRUCT_DESC = new TStruct("report_event_without_login_result");
        private static final TField BOOM_FIELD_DESC = new TField("boom", (byte) 12, 1);
        private static final TField BOMB_FIELD_DESC = new TField("bomb", (byte) 12, 2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum _Fields implements TFieldIdEnum {
            BOOM(1, "boom"),
            BOMB(2, "bomb");

            private static final Map<String, _Fields> byName = new HashMap();
            private final String _fieldName;
            private final short _thriftId;

            static {
                Iterator it = EnumSet.allOf(_Fields.class).iterator();
                while (it.hasNext()) {
                    _Fields _fields = (_Fields) it.next();
                    byName.put(_fields.getFieldName(), _fields);
                }
            }

            _Fields(short thriftId, String fieldName) {
                this._thriftId = thriftId;
                this._fieldName = fieldName;
            }

            public static _Fields findByName(String name) {
                return byName.get(name);
            }

            public static _Fields findByThriftId(int fieldId) {
                if (fieldId == 1) {
                    return BOOM;
                }
                if (fieldId != 2) {
                    return null;
                }
                return BOMB;
            }

            public static _Fields findByThriftIdOrThrow(int fieldId) {
                _Fields findByThriftId = findByThriftId(fieldId);
                if (findByThriftId != null) {
                    return findByThriftId;
                }
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public String getFieldName() {
                return this._fieldName;
            }

            @Override // org.apache.thrift.TFieldIdEnum
            public short getThriftFieldId() {
                return this._thriftId;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_without_login_resultStandardScheme extends StandardScheme<report_event_without_login_result> {
            private report_event_without_login_resultStandardScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol iprot, report_event_without_login_result struct) throws TException {
                iprot.readStructBegin();
                while (true) {
                    TField readFieldBegin = iprot.readFieldBegin();
                    byte b11 = readFieldBegin.type;
                    if (b11 == 0) {
                        iprot.readStructEnd();
                        struct.validate();
                        return;
                    }
                    short s11 = readFieldBegin.f77768id;
                    if (s11 != 1) {
                        if (s11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 12) {
                            LogicException logicException = new LogicException();
                            struct.bomb = logicException;
                            logicException.read(iprot);
                            struct.setBombIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        SystemException systemException = new SystemException();
                        struct.boom = systemException;
                        systemException.read(iprot);
                        struct.setBoomIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                    iprot.readFieldEnd();
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol oprot, report_event_without_login_result struct) throws TException {
                struct.validate();
                oprot.writeStructBegin(report_event_without_login_result.STRUCT_DESC);
                if (struct.boom != null) {
                    oprot.writeFieldBegin(report_event_without_login_result.BOOM_FIELD_DESC);
                    struct.boom.write(oprot);
                    oprot.writeFieldEnd();
                }
                if (struct.bomb != null) {
                    oprot.writeFieldBegin(report_event_without_login_result.BOMB_FIELD_DESC);
                    struct.bomb.write(oprot);
                    oprot.writeFieldEnd();
                }
                oprot.writeFieldStop();
                oprot.writeStructEnd();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_without_login_resultStandardSchemeFactory implements SchemeFactory {
            private report_event_without_login_resultStandardSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public report_event_without_login_resultStandardScheme getScheme() {
                return new report_event_without_login_resultStandardScheme();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_without_login_resultTupleScheme extends TupleScheme<report_event_without_login_result> {
            private report_event_without_login_resultTupleScheme() {
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void read(TProtocol prot, report_event_without_login_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet readBitSet = tTupleProtocol.readBitSet(2);
                if (readBitSet.get(0)) {
                    SystemException systemException = new SystemException();
                    struct.boom = systemException;
                    systemException.read(tTupleProtocol);
                    struct.setBoomIsSet(true);
                }
                if (readBitSet.get(1)) {
                    LogicException logicException = new LogicException();
                    struct.bomb = logicException;
                    logicException.read(tTupleProtocol);
                    struct.setBombIsSet(true);
                }
            }

            @Override // org.apache.thrift.scheme.IScheme
            public void write(TProtocol prot, report_event_without_login_result struct) throws TException {
                TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
                BitSet bitSet = new BitSet();
                if (struct.isSetBoom()) {
                    bitSet.set(0);
                }
                if (struct.isSetBomb()) {
                    bitSet.set(1);
                }
                tTupleProtocol.writeBitSet(bitSet, 2);
                if (struct.isSetBoom()) {
                    struct.boom.write(tTupleProtocol);
                }
                if (struct.isSetBomb()) {
                    struct.bomb.write(tTupleProtocol);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class report_event_without_login_resultTupleSchemeFactory implements SchemeFactory {
            private report_event_without_login_resultTupleSchemeFactory() {
            }

            @Override // org.apache.thrift.scheme.SchemeFactory
            public report_event_without_login_resultTupleScheme getScheme() {
                return new report_event_without_login_resultTupleScheme();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            schemes = hashMap;
            hashMap.put(StandardScheme.class, new report_event_without_login_resultStandardSchemeFactory());
            hashMap.put(TupleScheme.class, new report_event_without_login_resultTupleSchemeFactory());
            EnumMap enumMap = new EnumMap(_Fields.class);
            enumMap.put((EnumMap) _Fields.BOOM, (_Fields) new FieldMetaData("boom", (byte) 3, new FieldValueMetaData((byte) 12)));
            enumMap.put((EnumMap) _Fields.BOMB, (_Fields) new FieldMetaData("bomb", (byte) 3, new FieldValueMetaData((byte) 12)));
            Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
            metaDataMap = unmodifiableMap;
            FieldMetaData.addStructMetaDataMap(report_event_without_login_result.class, unmodifiableMap);
        }

        public report_event_without_login_result() {
        }

        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            try {
                read(new TCompactProtocol(new TIOStreamTransport(in2)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            try {
                write(new TCompactProtocol(new TIOStreamTransport(out)));
            } catch (TException e11) {
                throw new IOException(e11);
            }
        }

        @Override // org.apache.thrift.TBase
        public void clear() {
            this.boom = null;
            this.bomb = null;
        }

        public boolean equals(Object that) {
            if (that != null && (that instanceof report_event_without_login_result)) {
                return equals((report_event_without_login_result) that);
            }
            return false;
        }

        public LogicException getBomb() {
            return this.bomb;
        }

        public SystemException getBoom() {
            return this.boom;
        }

        public int hashCode() {
            return 0;
        }

        public boolean isSetBomb() {
            return this.bomb != null;
        }

        public boolean isSetBoom() {
            return this.boom != null;
        }

        @Override // org.apache.thrift.TBase
        public void read(TProtocol iprot) throws TException {
            schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
        }

        public report_event_without_login_result setBomb(LogicException bomb) {
            this.bomb = bomb;
            return this;
        }

        public void setBombIsSet(boolean value) {
            if (value) {
                return;
            }
            this.bomb = null;
        }

        public report_event_without_login_result setBoom(SystemException boom) {
            this.boom = boom;
            return this;
        }

        public void setBoomIsSet(boolean value) {
            if (value) {
                return;
            }
            this.boom = null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("report_event_without_login_result(");
            sb2.append("boom:");
            SystemException systemException = this.boom;
            if (systemException == null) {
                sb2.append("null");
            } else {
                sb2.append(systemException);
            }
            sb2.append(j2.O);
            sb2.append("bomb:");
            LogicException logicException = this.bomb;
            if (logicException == null) {
                sb2.append("null");
            } else {
                sb2.append(logicException);
            }
            sb2.append(pn.j.f81007d);
            return sb2.toString();
        }

        public void unsetBomb() {
            this.bomb = null;
        }

        public void unsetBoom() {
            this.boom = null;
        }

        @Override // org.apache.thrift.TBase
        public void write(TProtocol oprot) throws TException {
            schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
        }

        public report_event_without_login_result(SystemException boom, LogicException bomb) {
            this();
            this.boom = boom;
            this.bomb = bomb;
        }

        @Override // java.lang.Comparable
        public int compareTo(report_event_without_login_result other) {
            int compareTo;
            int compareTo2;
            if (!getClass().equals(other.getClass())) {
                return getClass().getName().compareTo(other.getClass().getName());
            }
            int compareTo3 = Boolean.valueOf(isSetBoom()).compareTo(Boolean.valueOf(other.isSetBoom()));
            if (compareTo3 != 0) {
                return compareTo3;
            }
            if (isSetBoom() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.boom, (Comparable) other.boom)) != 0) {
                return compareTo2;
            }
            int compareTo4 = Boolean.valueOf(isSetBomb()).compareTo(Boolean.valueOf(other.isSetBomb()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
            if (!isSetBomb() || (compareTo = TBaseHelper.compareTo((Comparable) this.bomb, (Comparable) other.bomb)) == 0) {
                return 0;
            }
            return compareTo;
        }

        @Override // org.apache.thrift.TBase
        /* renamed from: deepCopy */
        public TBase<report_event_without_login_result, _Fields> deepCopy2() {
            return new report_event_without_login_result(this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.apache.thrift.TBase
        public _Fields fieldForId(int fieldId) {
            return _Fields.findByThriftId(fieldId);
        }

        @Override // org.apache.thrift.TBase
        public Object getFieldValue(_Fields field) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_without_login_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return getBoom();
            }
            if (i11 == 2) {
                return getBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public boolean isSet(_Fields field) {
            if (field == null) {
                throw new IllegalArgumentException();
            }
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_without_login_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                return isSetBoom();
            }
            if (i11 == 2) {
                return isSetBomb();
            }
            throw new IllegalStateException();
        }

        @Override // org.apache.thrift.TBase
        public void setFieldValue(_Fields field, Object value) {
            int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczSystemApiService$report_event_without_login_result$_Fields[field.ordinal()];
            if (i11 == 1) {
                if (value == null) {
                    unsetBoom();
                    return;
                } else {
                    setBoom((SystemException) value);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            if (value == null) {
                unsetBomb();
            } else {
                setBomb((LogicException) value);
            }
        }

        public boolean equals(report_event_without_login_result that) {
            if (that == null) {
                return false;
            }
            boolean isSetBoom = isSetBoom();
            boolean isSetBoom2 = that.isSetBoom();
            if ((isSetBoom || isSetBoom2) && !(isSetBoom && isSetBoom2 && this.boom.equals(that.boom))) {
                return false;
            }
            boolean isSetBomb = isSetBomb();
            boolean isSetBomb2 = that.isSetBomb();
            if (isSetBomb || isSetBomb2) {
                return isSetBomb && isSetBomb2 && this.bomb.equals(that.bomb);
            }
            return true;
        }

        public report_event_without_login_result(report_event_without_login_result other) {
            if (other.isSetBoom()) {
                this.boom = new SystemException(other.boom);
            }
            if (other.isSetBomb()) {
                this.bomb = new LogicException(other.bomb);
            }
        }

        public void validate() throws TException {
        }
    }
}
