package com.badlogic.gdx;

import androidx.exifinterface.media.ExifInterface;
import com.alipay.sdk.m.u.i;
import com.badlogic.gdx.utils.k;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.connect.common.Constants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface Input {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum OnscreenKeyboardType {
        Default,
        NumberPad,
        PhonePad,
        Email,
        Password,
        URI
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Orientation {
        Landscape,
        Portrait
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Peripheral {
        HardwareKeyboard,
        OnscreenKeyboard,
        MultitouchScreen,
        Accelerometer,
        Compass,
        Vibrator,
        HapticFeedback,
        Gyroscope,
        RotationVector,
        Pressure
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum VibrationType {
        LIGHT,
        MEDIUM,
        HEAVY
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f11353a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f11354b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f11355c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f11356d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f11357e = 4;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        boolean a(String str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {
        public static final int A = 67;
        public static final int A0 = 45;
        public static final int A1 = 105;
        public static final int A2 = 255;
        public static final int B = 67;
        public static final int B0 = 46;
        public static final int B1 = 106;
        public static k<String> B2 = null;
        public static final int C = 112;
        public static final int C0 = 72;
        public static final int C1 = 107;
        public static final int D = 23;
        public static final int D0 = 47;
        public static final int D1 = 108;
        public static final int E = 20;
        public static final int E0 = 116;
        public static final int E1 = 109;
        public static final int F = 21;
        public static final int F0 = 84;
        public static final int F1 = 110;
        public static final int G = 22;
        public static final int G0 = 74;
        public static final int G1 = 144;
        public static final int H = 19;
        public static final int H0 = 59;
        public static final int H1 = 145;
        public static final int I = 23;
        public static final int I0 = 60;
        public static final int I1 = 146;
        public static final int J = 20;
        public static final int J0 = 76;
        public static final int J1 = 147;
        public static final int K = 21;
        public static final int K0 = 1;
        public static final int K1 = 148;
        public static final int L = 22;
        public static final int L0 = 2;
        public static final int L1 = 149;
        public static final int M = 19;
        public static final int M0 = 62;
        public static final int M1 = 150;
        public static final int N = 33;
        public static final int N0 = 17;
        public static final int N1 = 151;
        public static final int O = 6;
        public static final int O0 = 63;
        public static final int O1 = 152;
        public static final int P = 66;
        public static final int P0 = 48;
        public static final int P1 = 153;
        public static final int Q = 65;
        public static final int Q0 = 61;
        public static final int Q1 = 154;
        public static final int R = 70;
        public static final int R0 = 49;
        public static final int R1 = 155;
        public static final int S = 64;
        public static final int S0 = 0;
        public static final int S1 = 156;
        public static final int T = 34;
        public static final int T0 = 50;
        public static final int T1 = 157;
        public static final int U = 80;
        public static final int U0 = 25;
        public static final int U1 = 158;
        public static final int V = 35;
        public static final int V0 = 24;
        public static final int V1 = 159;
        public static final int W = 68;
        public static final int W0 = 51;
        public static final int W1 = 160;
        public static final int X = 36;
        public static final int X0 = 52;
        public static final int X1 = 161;
        public static final int Y = 79;
        public static final int Y0 = 53;
        public static final int Y1 = 162;
        public static final int Z = 3;
        public static final int Z0 = 54;
        public static final int Z1 = 163;

        /* renamed from: a, reason: collision with root package name */
        public static final int f11358a = -1;

        /* renamed from: a0, reason: collision with root package name */
        public static final int f11359a0 = 37;

        /* renamed from: a1, reason: collision with root package name */
        public static final int f11360a1 = 16;

        /* renamed from: a2, reason: collision with root package name */
        public static final int f11361a2 = 143;

        /* renamed from: b, reason: collision with root package name */
        public static final int f11362b = 7;

        /* renamed from: b0, reason: collision with root package name */
        public static final int f11363b0 = 38;

        /* renamed from: b1, reason: collision with root package name */
        public static final int f11364b1 = 2;

        /* renamed from: b2, reason: collision with root package name */
        public static final int f11365b2 = 243;

        /* renamed from: c, reason: collision with root package name */
        public static final int f11366c = 8;

        /* renamed from: c0, reason: collision with root package name */
        public static final int f11367c0 = 39;

        /* renamed from: c1, reason: collision with root package name */
        public static final int f11368c1 = 32;

        /* renamed from: c2, reason: collision with root package name */
        public static final int f11369c2 = 131;

        /* renamed from: d, reason: collision with root package name */
        public static final int f11370d = 9;

        /* renamed from: d0, reason: collision with root package name */
        public static final int f11371d0 = 40;

        /* renamed from: d1, reason: collision with root package name */
        public static final int f11372d1 = 64;

        /* renamed from: d2, reason: collision with root package name */
        public static final int f11373d2 = 132;

        /* renamed from: e, reason: collision with root package name */
        public static final int f11374e = 10;

        /* renamed from: e0, reason: collision with root package name */
        public static final int f11375e0 = 71;

        /* renamed from: e1, reason: collision with root package name */
        public static final int f11376e1 = 1;

        /* renamed from: e2, reason: collision with root package name */
        public static final int f11377e2 = 133;

        /* renamed from: f, reason: collision with root package name */
        public static final int f11378f = 11;

        /* renamed from: f0, reason: collision with root package name */
        public static final int f11379f0 = 41;

        /* renamed from: f1, reason: collision with root package name */
        public static final int f11380f1 = 128;

        /* renamed from: f2, reason: collision with root package name */
        public static final int f11381f2 = 134;

        /* renamed from: g, reason: collision with root package name */
        public static final int f11382g = 12;

        /* renamed from: g0, reason: collision with root package name */
        public static final int f11383g0 = 90;

        /* renamed from: g1, reason: collision with root package name */
        public static final int f11384g1 = 4;

        /* renamed from: g2, reason: collision with root package name */
        public static final int f11385g2 = 135;

        /* renamed from: h, reason: collision with root package name */
        public static final int f11386h = 13;

        /* renamed from: h0, reason: collision with root package name */
        public static final int f11387h0 = 87;

        /* renamed from: h1, reason: collision with root package name */
        public static final int f11388h1 = 129;

        /* renamed from: h2, reason: collision with root package name */
        public static final int f11389h2 = 136;

        /* renamed from: i, reason: collision with root package name */
        public static final int f11390i = 14;

        /* renamed from: i0, reason: collision with root package name */
        public static final int f11391i0 = 85;

        /* renamed from: i1, reason: collision with root package name */
        public static final int f11392i1 = 130;

        /* renamed from: i2, reason: collision with root package name */
        public static final int f11393i2 = 137;

        /* renamed from: j, reason: collision with root package name */
        public static final int f11394j = 15;

        /* renamed from: j0, reason: collision with root package name */
        public static final int f11395j0 = 88;

        /* renamed from: j1, reason: collision with root package name */
        public static final int f11396j1 = 111;

        /* renamed from: j2, reason: collision with root package name */
        public static final int f11397j2 = 138;

        /* renamed from: k, reason: collision with root package name */
        public static final int f11398k = 16;

        /* renamed from: k0, reason: collision with root package name */
        public static final int f11399k0 = 89;

        /* renamed from: k1, reason: collision with root package name */
        public static final int f11400k1 = 123;

        /* renamed from: k2, reason: collision with root package name */
        public static final int f11401k2 = 139;

        /* renamed from: l, reason: collision with root package name */
        public static final int f11402l = 29;

        /* renamed from: l0, reason: collision with root package name */
        public static final int f11403l0 = 86;

        /* renamed from: l1, reason: collision with root package name */
        public static final int f11404l1 = 124;

        /* renamed from: l2, reason: collision with root package name */
        public static final int f11405l2 = 140;

        /* renamed from: m, reason: collision with root package name */
        public static final int f11406m = 57;

        /* renamed from: m0, reason: collision with root package name */
        public static final int f11407m0 = 82;

        /* renamed from: m1, reason: collision with root package name */
        public static final int f11408m1 = 92;

        /* renamed from: m2, reason: collision with root package name */
        public static final int f11409m2 = 141;

        /* renamed from: n, reason: collision with root package name */
        public static final int f11410n = 58;

        /* renamed from: n0, reason: collision with root package name */
        public static final int f11411n0 = 69;

        /* renamed from: n1, reason: collision with root package name */
        public static final int f11412n1 = 93;

        /* renamed from: n2, reason: collision with root package name */
        public static final int f11413n2 = 142;

        /* renamed from: o, reason: collision with root package name */
        public static final int f11414o = 75;

        /* renamed from: o0, reason: collision with root package name */
        public static final int f11415o0 = 91;

        /* renamed from: o1, reason: collision with root package name */
        public static final int f11416o1 = 94;

        /* renamed from: o2, reason: collision with root package name */
        public static final int f11417o2 = 183;

        /* renamed from: p, reason: collision with root package name */
        public static final int f11418p = 77;

        /* renamed from: p0, reason: collision with root package name */
        public static final int f11419p0 = 42;

        /* renamed from: p1, reason: collision with root package name */
        public static final int f11420p1 = 95;

        /* renamed from: p2, reason: collision with root package name */
        public static final int f11421p2 = 184;

        /* renamed from: q, reason: collision with root package name */
        public static final int f11422q = 30;

        /* renamed from: q0, reason: collision with root package name */
        public static final int f11423q0 = 83;

        /* renamed from: q1, reason: collision with root package name */
        public static final int f11424q1 = 255;

        /* renamed from: q2, reason: collision with root package name */
        public static final int f11425q2 = 185;

        /* renamed from: r, reason: collision with root package name */
        public static final int f11426r = 4;

        /* renamed from: r0, reason: collision with root package name */
        public static final int f11427r0 = 78;

        /* renamed from: r1, reason: collision with root package name */
        public static final int f11428r1 = 96;

        /* renamed from: r2, reason: collision with root package name */
        public static final int f11429r2 = 186;

        /* renamed from: s, reason: collision with root package name */
        public static final int f11430s = 73;

        /* renamed from: s0, reason: collision with root package name */
        public static final int f11431s0 = 43;

        /* renamed from: s1, reason: collision with root package name */
        public static final int f11432s1 = 97;

        /* renamed from: s2, reason: collision with root package name */
        public static final int f11433s2 = 187;

        /* renamed from: t, reason: collision with root package name */
        public static final int f11434t = 31;

        /* renamed from: t0, reason: collision with root package name */
        public static final int f11435t0 = 44;

        /* renamed from: t1, reason: collision with root package name */
        public static final int f11436t1 = 98;

        /* renamed from: t2, reason: collision with root package name */
        public static final int f11437t2 = 188;

        /* renamed from: u, reason: collision with root package name */
        public static final int f11438u = 5;

        /* renamed from: u0, reason: collision with root package name */
        public static final int f11439u0 = 121;

        /* renamed from: u1, reason: collision with root package name */
        public static final int f11440u1 = 99;

        /* renamed from: u2, reason: collision with root package name */
        public static final int f11441u2 = 189;

        /* renamed from: v, reason: collision with root package name */
        public static final int f11442v = 27;

        /* renamed from: v0, reason: collision with root package name */
        public static final int f11443v0 = 56;

        /* renamed from: v1, reason: collision with root package name */
        public static final int f11444v1 = 100;

        /* renamed from: v2, reason: collision with root package name */
        public static final int f11445v2 = 190;

        /* renamed from: w, reason: collision with root package name */
        public static final int f11446w = 115;

        /* renamed from: w0, reason: collision with root package name */
        public static final int f11447w0 = 81;

        /* renamed from: w1, reason: collision with root package name */
        public static final int f11448w1 = 101;

        /* renamed from: w2, reason: collision with root package name */
        public static final int f11449w2 = 191;

        /* renamed from: x, reason: collision with root package name */
        public static final int f11450x = 28;

        /* renamed from: x0, reason: collision with root package name */
        public static final int f11451x0 = 18;

        /* renamed from: x1, reason: collision with root package name */
        public static final int f11452x1 = 102;

        /* renamed from: x2, reason: collision with root package name */
        public static final int f11453x2 = 192;

        /* renamed from: y, reason: collision with root package name */
        public static final int f11454y = 55;

        /* renamed from: y0, reason: collision with root package name */
        public static final int f11455y0 = 26;

        /* renamed from: y1, reason: collision with root package name */
        public static final int f11456y1 = 103;

        /* renamed from: y2, reason: collision with root package name */
        public static final int f11457y2 = 193;

        /* renamed from: z, reason: collision with root package name */
        public static final int f11458z = 32;

        /* renamed from: z0, reason: collision with root package name */
        public static final int f11459z0 = 120;

        /* renamed from: z1, reason: collision with root package name */
        public static final int f11460z1 = 104;

        /* renamed from: z2, reason: collision with root package name */
        public static final int f11461z2 = 194;

        public static void a() {
            B2 = new k<>();
            for (int i11 = 0; i11 < 256; i11++) {
                String b11 = b(i11);
                if (b11 != null) {
                    B2.r(b11, i11);
                }
            }
        }

        public static String b(int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("keycode cannot be negative, keycode: " + i11);
            }
            if (i11 > 255) {
                throw new IllegalArgumentException("keycode cannot be greater than 255, keycode: " + i11);
            }
            if (i11 == 115) {
                return "Caps Lock";
            }
            if (i11 == 116) {
                return "Scroll Lock";
            }
            if (i11 == 120) {
                return "Print";
            }
            if (i11 == 121) {
                return "Pause";
            }
            if (i11 == 123) {
                return "End";
            }
            if (i11 == 124) {
                return "Insert";
            }
            if (i11 == 243) {
                return ":";
            }
            switch (i11) {
                case 0:
                    return PermissionStatusUtilKt.PERMISSION_STATUS_UNKNOWN;
                case 1:
                    return "Soft Left";
                case 2:
                    return "Soft Right";
                case 3:
                    return "Home";
                case 4:
                    return "Back";
                case 5:
                    return "Call";
                case 6:
                    return "End Call";
                case 7:
                    return "0";
                case 8:
                    return "1";
                case 9:
                    return "2";
                case 10:
                    return "3";
                case 11:
                    return "4";
                case 12:
                    return "5";
                case 13:
                    return Constants.VIA_SHARE_TYPE_INFO;
                case 14:
                    return "7";
                case 15:
                    return Constants.VIA_SHARE_TYPE_PUBLISHVIDEO;
                case 16:
                    return Constants.VIA_SHARE_TYPE_MINI_PROGRAM;
                case 17:
                    return "*";
                case 18:
                    return "#";
                case 19:
                    return "Up";
                case 20:
                    return "Down";
                case 21:
                    return "Left";
                case 22:
                    return "Right";
                case 23:
                    return "Center";
                case 24:
                    return "Volume Up";
                case 25:
                    return "Volume Down";
                case 26:
                    return "Power";
                case 27:
                    return "Camera";
                case 28:
                    return "Clear";
                case 29:
                    return ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
                case 30:
                    return "B";
                case 31:
                    return "C";
                case 32:
                    return "D";
                case 33:
                    return ExifInterface.LONGITUDE_EAST;
                case 34:
                    return "F";
                case 35:
                    return "G";
                case 36:
                    return "H";
                case 37:
                    return "I";
                case 38:
                    return "J";
                case 39:
                    return "K";
                case 40:
                    return "L";
                case 41:
                    return "M";
                case 42:
                    return "N";
                case 43:
                    return "O";
                case 44:
                    return "P";
                case 45:
                    return "Q";
                case 46:
                    return "R";
                case 47:
                    return ExifInterface.LATITUDE_SOUTH;
                case 48:
                    return ExifInterface.GPS_DIRECTION_TRUE;
                case 49:
                    return "U";
                case 50:
                    return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
                case 51:
                    return ExifInterface.LONGITUDE_WEST;
                case 52:
                    return "X";
                case 53:
                    return "Y";
                case 54:
                    return "Z";
                case 55:
                    return ",";
                case 56:
                    return ".";
                case 57:
                    return "L-Alt";
                case 58:
                    return "R-Alt";
                case 59:
                    return "L-Shift";
                case 60:
                    return "R-Shift";
                case 61:
                    return "Tab";
                case 62:
                    return "Space";
                case 63:
                    return "SYM";
                case 64:
                    return "Explorer";
                case 65:
                    return "Envelope";
                case 66:
                    return "Enter";
                case 67:
                    return "Delete";
                case 68:
                    return "`";
                case 69:
                    return com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER;
                case 70:
                    return ContainerUtils.KEY_VALUE_DELIMITER;
                case 71:
                    return "[";
                case 72:
                    return "]";
                case 73:
                    return "\\";
                case 74:
                    return i.f11097b;
                case 75:
                    return "'";
                case 76:
                    return "/";
                case 77:
                    return EmailAutoCompleteEditText.f17091d;
                case 78:
                    return "Num";
                case 79:
                    return "Headset Hook";
                case 80:
                    return "Focus";
                case 81:
                    return "Plus";
                case 82:
                    return "Menu";
                case 83:
                    return "Notification";
                case 84:
                    return "Search";
                case 85:
                    return "Play/Pause";
                case 86:
                    return "Stop Media";
                case 87:
                    return "Next Media";
                case 88:
                    return "Prev Media";
                case 89:
                    return "Rewind";
                case 90:
                    return "Fast Forward";
                case 91:
                    return "Mute";
                case 92:
                    return "Page Up";
                case 93:
                    return "Page Down";
                case 94:
                    return "PICTSYMBOLS";
                case 95:
                    return "SWITCH_CHARSET";
                case 96:
                    return "A Button";
                case 97:
                    return "B Button";
                case 98:
                    return "C Button";
                case 99:
                    return "X Button";
                case 100:
                    return "Y Button";
                case 101:
                    return "Z Button";
                case 102:
                    return "L1 Button";
                case 103:
                    return "R1 Button";
                case 104:
                    return "L2 Button";
                case 105:
                    return "R2 Button";
                case 106:
                    return "Left Thumb";
                case 107:
                    return "Right Thumb";
                case 108:
                    return "Start";
                case 109:
                    return "Select";
                case 110:
                    return "Button Mode";
                case 111:
                    return "Escape";
                case 112:
                    return "Forward Delete";
                default:
                    switch (i11) {
                        case 129:
                            return "L-Ctrl";
                        case 130:
                            return "R-Ctrl";
                        case 131:
                            return "F1";
                        case 132:
                            return "F2";
                        case 133:
                            return "F3";
                        case 134:
                            return "F4";
                        case 135:
                            return "F5";
                        case 136:
                            return "F6";
                        case 137:
                            return "F7";
                        case 138:
                            return "F8";
                        case 139:
                            return "F9";
                        case 140:
                            return "F10";
                        case 141:
                            return "F11";
                        case 142:
                            return "F12";
                        case 143:
                            return "Num Lock";
                        case 144:
                            return "Numpad 0";
                        case 145:
                            return "Numpad 1";
                        case 146:
                            return "Numpad 2";
                        case 147:
                            return "Numpad 3";
                        case 148:
                            return "Numpad 4";
                        case 149:
                            return "Numpad 5";
                        case 150:
                            return "Numpad 6";
                        case 151:
                            return "Numpad 7";
                        case 152:
                            return "Numpad 8";
                        case 153:
                            return "Numpad 9";
                        case 154:
                            return "Num /";
                        case 155:
                            return "Num *";
                        case 156:
                            return "Num -";
                        case 157:
                            return "Num +";
                        case 158:
                            return "Num .";
                        case 159:
                            return "Num ,";
                        case 160:
                            return "Num Enter";
                        case 161:
                            return "Num =";
                        case 162:
                            return "Num (";
                        case 163:
                            return "Num )";
                        default:
                            switch (i11) {
                                case 183:
                                    return "F13";
                                case 184:
                                    return "F14";
                                case 185:
                                    return "F15";
                                case 186:
                                    return "F16";
                                case 187:
                                    return "F17";
                                case 188:
                                    return "F18";
                                case 189:
                                    return "F19";
                                case 190:
                                    return "F20";
                                case 191:
                                    return "F21";
                                case 192:
                                    return "F22";
                                case 193:
                                    return "F23";
                                case 194:
                                    return "F24";
                                default:
                                    return null;
                            }
                    }
            }
        }

        public static int c(String str) {
            if (B2 == null) {
                a();
            }
            return B2.j(str, -1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void a(String str);

        void b();
    }

    void A(int i11, int i12, boolean z11);

    float B();

    int C();

    float D();

    boolean E(int i11);

    float F();

    void G(boolean z11);

    boolean H(int i11);

    void I(boolean z11, OnscreenKeyboardType onscreenKeyboardType);

    boolean J(int i11);

    Orientation K();

    float L();

    void M(e eVar, String str, String str2, String str3, OnscreenKeyboardType onscreenKeyboardType);

    float N(int i11);

    void O(int i11, boolean z11);

    int P();

    void Q(p2.b bVar);

    float R();

    int S();

    void T(q1.k kVar);

    int U(int i11);

    float V();

    int W(int i11);

    void a(int i11, int i12);

    void b(e eVar, String str, String str2, String str3);

    boolean c(int i11);

    boolean d();

    void e(int i11, boolean z11);

    long f();

    int g();

    int getY();

    boolean h();

    void i(VibrationType vibrationType);

    boolean j();

    int k(int i11);

    void l(float[] fArr);

    boolean m(int i11);

    float n();

    int o();

    void p(int i11);

    boolean q(Peripheral peripheral);

    float r();

    void s(boolean z11);

    boolean t(int i11);

    void u(boolean z11);

    void v(c cVar);

    q1.k w();

    float x();

    float y();

    int z(int i11);
}
