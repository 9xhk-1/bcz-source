package com.google.zxing;

import java.util.Map;
import wp.b0;
import wp.o;
import wp.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class g implements n {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35063a;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            f35063a = iArr;
            try {
                iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35063a[BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35063a[BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35063a[BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35063a[BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35063a[BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35063a[BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35063a[BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35063a[BarcodeFormat.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35063a[BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35063a[BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35063a[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35063a[BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.n
    public kp.b a(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        n lVar;
        switch (a.f35063a[barcodeFormat.ordinal()]) {
            case 1:
                lVar = new wp.l();
                break;
            case 2:
                lVar = new b0();
                break;
            case 3:
                lVar = new wp.j();
                break;
            case 4:
                lVar = new u();
                break;
            case 5:
                lVar = new fq.b();
                break;
            case 6:
                lVar = new wp.f();
                break;
            case 7:
                lVar = new wp.h();
                break;
            case 8:
                lVar = new wp.d();
                break;
            case 9:
                lVar = new o();
                break;
            case 10:
                lVar = new aq.d();
                break;
            case 11:
                lVar = new wp.b();
                break;
            case 12:
                lVar = new np.b();
                break;
            case 13:
                lVar = new fp.c();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
        }
        return lVar.a(str, barcodeFormat, i11, i12, map);
    }

    @Override // com.google.zxing.n
    public kp.b b(String str, BarcodeFormat barcodeFormat, int i11, int i12) throws WriterException {
        return a(str, barcodeFormat, i11, i12, null);
    }
}
