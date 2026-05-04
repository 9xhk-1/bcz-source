package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FrameworkMediaDrm implements ExoMediaDrm {
    private static final String CENC_SCHEME_MIME_TYPE = "cenc";

    @UnstableApi
    public static final ExoMediaDrm.Provider DEFAULT_PROVIDER = new ExoMediaDrm.Provider() { // from class: androidx.media3.exoplayer.drm.t
        @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.Provider
        public final ExoMediaDrm acquireExoMediaDrm(UUID uuid) {
            return FrameworkMediaDrm.b(uuid);
        }
    };
    private static final String MOCK_LA_URL = "<LA_URL>https://x</LA_URL>";
    private static final String MOCK_LA_URL_VALUE = "https://x";
    private static final String TAG = "FrameworkMediaDrm";
    private static final int UTF_16_BYTES_PER_CHARACTER = 2;
    private final MediaDrm mediaDrm;
    private int referenceCount;
    private final UUID uuid;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(31)
    public static class Api31 {
        private Api31() {
        }

        public static boolean requiresSecureDecoder(MediaDrm mediaDrm, String str, int i11) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str, i11);
            return requiresSecureDecoder;
        }

        public static void setLogSessionIdOnMediaDrmSession(MediaDrm mediaDrm, byte[] bArr, PlayerId playerId) {
            LogSessionId logSessionId;
            boolean equals;
            MediaDrm.PlaybackComponent playbackComponent;
            LogSessionId logSessionId2 = playerId.getLogSessionId();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = logSessionId2.equals(logSessionId);
            if (equals) {
                return;
            }
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            z.a(Assertions.checkNotNull(playbackComponent)).setLogSessionId(logSessionId2);
        }
    }

    private FrameworkMediaDrm(UUID uuid) throws UnsupportedSchemeException {
        Assertions.checkNotNull(uuid);
        Assertions.checkArgument(!C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.uuid = uuid;
        MediaDrm mediaDrm = new MediaDrm(adjustUuid(uuid));
        this.mediaDrm = mediaDrm;
        this.referenceCount = 1;
        if (C.WIDEVINE_UUID.equals(uuid) && needsForceWidevineL3Workaround()) {
            forceWidevineL3(mediaDrm);
        }
    }

    public static /* synthetic */ void a(FrameworkMediaDrm frameworkMediaDrm, ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, MediaDrm mediaDrm, byte[] bArr, long j11) {
        frameworkMediaDrm.getClass();
        onExpirationUpdateListener.onExpirationUpdate(frameworkMediaDrm, bArr, j11);
    }

    private static byte[] addLaUrlAttributeIfMissing(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        short readLittleEndianShort = parsableByteArray.readLittleEndianShort();
        short readLittleEndianShort2 = parsableByteArray.readLittleEndianShort();
        if (readLittleEndianShort != 1 || readLittleEndianShort2 != 1) {
            Log.i(TAG, "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short readLittleEndianShort3 = parsableByteArray.readLittleEndianShort();
        Charset charset = StandardCharsets.UTF_16LE;
        String readString = parsableByteArray.readString(readLittleEndianShort3, charset);
        if (readString.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = readString.indexOf("</DATA>");
        if (indexOf == -1) {
            Log.w(TAG, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = readString.substring(0, indexOf) + MOCK_LA_URL + readString.substring(indexOf);
        int i11 = readLittleEndianInt + 52;
        ByteBuffer allocate = ByteBuffer.allocate(i11);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i11);
        allocate.putShort(readLittleEndianShort);
        allocate.putShort(readLittleEndianShort2);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(charset));
        return allocate.array();
    }

    private String adjustLicenseServerUrl(String str) {
        if (MOCK_LA_URL.equals(str)) {
            return "";
        }
        if (Util.SDK_INT >= 33 && "https://default.url".equals(str)) {
            String propertyString = getPropertyString("version");
            if (Objects.equals(propertyString, "1.2") || Objects.equals(propertyString, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] adjustRequestData(UUID uuid, byte[] bArr) {
        return C.CLEARKEY_UUID.equals(uuid) ? ClearKeyUtil.adjustRequestData(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if ("AFTT".equals(r0) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] adjustRequestInitData(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = androidx.media3.common.C.PLAYREADY_UUID
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = androidx.media3.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = addLaUrlAttributeIfMissing(r4)
            byte[] r4 = androidx.media3.extractor.mp4.PsshAtomUtil.buildPsshAtom(r0, r4)
        L18:
            boolean r1 = cdmRequiresCommonPsshUuid(r3)
            if (r1 == 0) goto L2e
            androidx.media3.extractor.mp4.PsshAtomUtil$PsshAtom r1 = androidx.media3.extractor.mp4.PsshAtomUtil.parsePsshAtom(r4)
            if (r1 == 0) goto L2e
            java.util.UUID r4 = androidx.media3.common.C.COMMON_PSSH_UUID
            java.util.UUID[] r2 = r1.keyIds
            byte[] r1 = r1.schemeData
            byte[] r4 = androidx.media3.extractor.mp4.PsshAtomUtil.buildPsshAtom(r4, r2, r1)
        L2e:
            int r1 = androidx.media3.common.util.Util.SDK_INT
            r2 = 23
            if (r1 >= r2) goto L3c
            java.util.UUID r1 = androidx.media3.common.C.WIDEVINE_UUID
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6e
        L3c:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L75
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L75
        L6e:
            byte[] r3 = androidx.media3.extractor.mp4.PsshAtomUtil.parseSchemeSpecificData(r4, r3)
            if (r3 == 0) goto L75
            return r3
        L75:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.FrameworkMediaDrm.adjustRequestInitData(java.util.UUID, byte[]):byte[]");
    }

    private static String adjustRequestMimeType(UUID uuid, String str) {
        return (Util.SDK_INT < 26 && C.CLEARKEY_UUID.equals(uuid) && (MimeTypes.VIDEO_MP4.equals(str) || MimeTypes.AUDIO_MP4.equals(str))) ? "cenc" : str;
    }

    private static UUID adjustUuid(UUID uuid) {
        return cdmRequiresCommonPsshUuid(uuid) ? C.COMMON_PSSH_UUID : uuid;
    }

    public static /* synthetic */ ExoMediaDrm b(UUID uuid) {
        try {
            return newInstance(uuid);
        } catch (UnsupportedDrmException unused) {
            Log.e(TAG, "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new DummyExoMediaDrm();
        }
    }

    public static /* synthetic */ void c(FrameworkMediaDrm frameworkMediaDrm, ExoMediaDrm.OnEventListener onEventListener, MediaDrm mediaDrm, byte[] bArr, int i11, int i12, byte[] bArr2) {
        frameworkMediaDrm.getClass();
        onEventListener.onEvent(frameworkMediaDrm, bArr, i11, i12, bArr2);
    }

    private static boolean cdmRequiresCommonPsshUuid(UUID uuid) {
        return Util.SDK_INT < 27 && Objects.equals(uuid, C.CLEARKEY_UUID);
    }

    public static /* synthetic */ void d(FrameworkMediaDrm frameworkMediaDrm, ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, MediaDrm mediaDrm, byte[] bArr, List list, boolean z11) {
        frameworkMediaDrm.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
            arrayList.add(new ExoMediaDrm.KeyStatus(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        onKeyStatusChangeListener.onKeyStatusChange(frameworkMediaDrm, bArr, arrayList, z11);
    }

    private static void forceWidevineL3(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static DrmInitData.SchemeData getSchemeData(UUID uuid, List<DrmInitData.SchemeData> list) {
        if (!C.WIDEVINE_UUID.equals(uuid)) {
            return list.get(0);
        }
        if (Util.SDK_INT >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                DrmInitData.SchemeData schemeData2 = list.get(i12);
                byte[] bArr = (byte[]) Assertions.checkNotNull(schemeData2.data);
                if (Objects.equals(schemeData2.mimeType, schemeData.mimeType) && Objects.equals(schemeData2.licenseServerUrl, schemeData.licenseServerUrl) && PsshAtomUtil.isPsshAtom(bArr)) {
                    i11 += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i11];
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                byte[] bArr3 = (byte[]) Assertions.checkNotNull(list.get(i14).data);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i13, length);
                i13 += length;
            }
            return schemeData.copyWithData(bArr2);
        }
        for (int i15 = 0; i15 < list.size(); i15++) {
            DrmInitData.SchemeData schemeData3 = list.get(i15);
            int parseVersion = PsshAtomUtil.parseVersion((byte[]) Assertions.checkNotNull(schemeData3.data));
            int i16 = Util.SDK_INT;
            if ((i16 < 23 && parseVersion == 0) || (i16 >= 23 && parseVersion == 1)) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    public static boolean isCryptoSchemeSupported(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(adjustUuid(uuid));
    }

    @RequiresApi(31)
    private boolean isMediaDrmRequiresSecureDecoderImplemented() {
        if (!this.uuid.equals(C.WIDEVINE_UUID)) {
            return this.uuid.equals(C.CLEARKEY_UUID);
        }
        String propertyString = getPropertyString("version");
        return (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
    }

    private static boolean needsForceWidevineL3Workaround() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    @UnstableApi
    public static FrameworkMediaDrm newInstance(UUID uuid) throws UnsupportedDrmException {
        try {
            return new FrameworkMediaDrm(uuid);
        } catch (UnsupportedSchemeException e11) {
            throw new UnsupportedDrmException(1, e11);
        } catch (Exception e12) {
            throw new UnsupportedDrmException(2, e12);
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public synchronized void acquire() {
        Assertions.checkState(this.referenceCount > 0);
        this.referenceCount++;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void closeSession(byte[] bArr) {
        this.mediaDrm.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public int getCryptoType() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @SuppressLint({"WrongConstant"})
    @UnstableApi
    public ExoMediaDrm.KeyRequest getKeyRequest(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i11, @Nullable HashMap<String, String> hashMap) throws NotProvisionedException {
        DrmInitData.SchemeData schemeData;
        byte[] bArr2;
        String str;
        if (list != null) {
            schemeData = getSchemeData(this.uuid, list);
            bArr2 = adjustRequestInitData(this.uuid, (byte[]) Assertions.checkNotNull(schemeData.data));
            str = adjustRequestMimeType(this.uuid, schemeData.mimeType);
        } else {
            schemeData = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.mediaDrm.getKeyRequest(bArr, bArr2, str, i11, hashMap);
        byte[] adjustRequestData = adjustRequestData(this.uuid, keyRequest.getData());
        String adjustLicenseServerUrl = adjustLicenseServerUrl(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(adjustLicenseServerUrl) && schemeData != null && !TextUtils.isEmpty(schemeData.licenseServerUrl)) {
            adjustLicenseServerUrl = schemeData.licenseServerUrl;
        }
        return new ExoMediaDrm.KeyRequest(adjustRequestData, adjustLicenseServerUrl, Util.SDK_INT >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @Nullable
    @UnstableApi
    public PersistableBundle getMetrics() {
        PersistableBundle metrics;
        if (Util.SDK_INT < 28) {
            return null;
        }
        metrics = this.mediaDrm.getMetrics();
        return metrics;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @RequiresApi(29)
    @UnstableApi
    public List<byte[]> getOfflineLicenseKeySetIds() {
        List<byte[]> offlineLicenseKeySetIds;
        if (Util.SDK_INT < 29) {
            throw new UnsupportedOperationException();
        }
        offlineLicenseKeySetIds = this.mediaDrm.getOfflineLicenseKeySetIds();
        return offlineLicenseKeySetIds;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public byte[] getPropertyByteArray(String str) {
        return this.mediaDrm.getPropertyByteArray(str);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public String getPropertyString(String str) {
        return this.mediaDrm.getPropertyString(str);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.mediaDrm.getProvisionRequest();
        return new ExoMediaDrm.ProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public byte[] openSession() throws MediaDrmException {
        return this.mediaDrm.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @Nullable
    @UnstableApi
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (C.CLEARKEY_UUID.equals(this.uuid)) {
            bArr2 = ClearKeyUtil.adjustResponseData(bArr2);
        }
        return this.mediaDrm.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.mediaDrm.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public synchronized void release() {
        int i11 = this.referenceCount - 1;
        this.referenceCount = i11;
        if (i11 == 0) {
            this.mediaDrm.release();
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @RequiresApi(29)
    @UnstableApi
    public void removeOfflineLicense(byte[] bArr) {
        if (Util.SDK_INT < 29) {
            throw new UnsupportedOperationException();
        }
        this.mediaDrm.removeOfflineLicense(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public boolean requiresSecureDecoder(byte[] bArr, String str) {
        MediaCrypto mediaCrypto;
        int securityLevel;
        if (Util.SDK_INT >= 31 && isMediaDrmRequiresSecureDecoderImplemented()) {
            MediaDrm mediaDrm = this.mediaDrm;
            securityLevel = mediaDrm.getSecurityLevel(bArr);
            return Api31.requiresSecureDecoder(mediaDrm, str, securityLevel);
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto(adjustUuid(this.uuid), bArr);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z11 = !this.uuid.equals(C.CLEARKEY_UUID);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z11;
        } catch (Throwable th3) {
            th = th3;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.mediaDrm.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void setOnEventListener(@Nullable final ExoMediaDrm.OnEventListener onEventListener) {
        this.mediaDrm.setOnEventListener(onEventListener == null ? null : new MediaDrm.OnEventListener() { // from class: androidx.media3.exoplayer.drm.v
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i11, int i12, byte[] bArr2) {
                FrameworkMediaDrm.c(FrameworkMediaDrm.this, onEventListener, mediaDrm, bArr, i11, i12, bArr2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @RequiresApi(23)
    @UnstableApi
    public void setOnExpirationUpdateListener(@Nullable final ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener) {
        if (Util.SDK_INT < 23) {
            throw new UnsupportedOperationException();
        }
        this.mediaDrm.setOnExpirationUpdateListener(onExpirationUpdateListener == null ? null : new MediaDrm.OnExpirationUpdateListener() { // from class: androidx.media3.exoplayer.drm.u
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j11) {
                FrameworkMediaDrm.a(FrameworkMediaDrm.this, onExpirationUpdateListener, mediaDrm, bArr, j11);
            }
        }, (Handler) null);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @RequiresApi(23)
    @UnstableApi
    public void setOnKeyStatusChangeListener(@Nullable final ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener) {
        if (Util.SDK_INT < 23) {
            throw new UnsupportedOperationException();
        }
        this.mediaDrm.setOnKeyStatusChangeListener(onKeyStatusChangeListener == null ? null : new MediaDrm.OnKeyStatusChangeListener() { // from class: androidx.media3.exoplayer.drm.w
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z11) {
                FrameworkMediaDrm.d(FrameworkMediaDrm.this, onKeyStatusChangeListener, mediaDrm, bArr, list, z11);
            }
        }, (Handler) null);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void setPlayerIdForSession(byte[] bArr, PlayerId playerId) {
        if (Util.SDK_INT >= 31) {
            try {
                Api31.setLogSessionIdOnMediaDrmSession(this.mediaDrm, bArr, playerId);
            } catch (UnsupportedOperationException unused) {
                Log.w(TAG, "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void setPropertyByteArray(String str, byte[] bArr) {
        this.mediaDrm.setPropertyByteArray(str, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public void setPropertyString(String str, String str2) {
        this.mediaDrm.setPropertyString(str, str2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    @UnstableApi
    public FrameworkCryptoConfig createCryptoConfig(byte[] bArr) throws MediaCryptoException {
        return new FrameworkCryptoConfig(adjustUuid(this.uuid), bArr);
    }
}
