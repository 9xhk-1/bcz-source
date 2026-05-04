package com.tencent.liteav.videodecoder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e {
    public static boolean a(int i11, int i12, int i13) {
        if (com.tencent.liteav.basic.a.a()) {
            return true;
        }
        return b(i11, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(int r18, int r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            android.media.MediaCodecList r2 = new android.media.MediaCodecList
            r3 = 0
            r2.<init>(r3)
            android.media.MediaCodecInfo[] r4 = r2.getCodecInfos()
            int r5 = r4.length
            r6 = r3
            r7 = r6
        L11:
            java.lang.String r8 = "TXCVideoDecoderUtils"
            r9 = 1
            if (r6 >= r5) goto L9c
            r10 = r4[r6]
            java.lang.String[] r11 = r10.getSupportedTypes()
            boolean r12 = r10.isEncoder()
            if (r12 == 0) goto L28
        L22:
            r12 = r20
            r16 = r4
            goto L95
        L28:
            int r12 = r11.length
            r13 = r3
        L2a:
            if (r13 >= r12) goto L22
            r14 = r11[r13]
            java.lang.String r15 = "video/hevc"
            boolean r16 = r14.contains(r15)
            if (r16 != 0) goto L39
            int r13 = r13 + 1
            goto L2a
        L39:
            android.media.MediaCodecInfo$CodecCapabilities r11 = r10.getCapabilitiesForType(r14)
            if (r11 != 0) goto L40
        L3f:
            goto L22
        L40:
            android.media.MediaCodecInfo$VideoCapabilities r11 = r11.getVideoCapabilities()
            if (r11 != 0) goto L47
            goto L3f
        L47:
            r12 = r20
            r16 = r4
            double r3 = (double) r12
            boolean r17 = r11.areSizeAndRateSupported(r0, r1, r3)
            boolean r3 = r11.areSizeAndRateSupported(r1, r0, r3)
            java.lang.String r4 = r10.getName()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r17)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r14, r10, r11}
            java.lang.String r10 = "got hevc decoder:%s, type:%s, supportPort= %b,supportLand=%b"
            com.tencent.liteav.basic.log.TXCLog.i(r8, r10, r4)
            if (r3 == 0) goto L6f
            if (r17 == 0) goto L6f
        L6d:
            r7 = r9
            goto L95
        L6f:
            if (r3 != 0) goto L74
            if (r17 != 0) goto L74
            goto L82
        L74:
            if (r3 != 0) goto L7b
            android.media.MediaFormat r3 = android.media.MediaFormat.createVideoFormat(r15, r1, r0)
            goto L83
        L7b:
            if (r17 != 0) goto L82
            android.media.MediaFormat r3 = android.media.MediaFormat.createVideoFormat(r15, r0, r1)
            goto L83
        L82:
            r3 = 0
        L83:
            if (r3 == 0) goto L95
            java.lang.String r3 = r2.findDecoderForFormat(r3)
            java.lang.String r4 = "findDecoderForFormat hevc decodername:%s"
            java.lang.Object[] r10 = new java.lang.Object[]{r3}
            com.tencent.liteav.basic.log.TXCLog.i(r8, r4, r10)
            if (r3 == 0) goto L95
            goto L6d
        L95:
            int r6 = r6 + 1
            r4 = r16
            r3 = 0
            goto L11
        L9c:
            if (r7 == 0) goto Laa
            com.tencent.liteav.basic.d.c r0 = com.tencent.liteav.basic.d.c.a()
            boolean r0 = r0.f()
            if (r0 == 0) goto Laa
            r3 = r9
            goto Lab
        Laa:
            r3 = 0
        Lab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "config hevc decoder switch : "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " ,isSupport="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.liteav.basic.log.TXCLog.i(r8, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videodecoder.e.b(int, int, int):boolean");
    }
}
