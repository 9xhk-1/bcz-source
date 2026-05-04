package androidx.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.aa;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class AudioCapabilities {

    @VisibleForTesting
    static final int DEFAULT_MAX_CHANNEL_COUNT = 10;

    @VisibleForTesting
    static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private static final String FORCE_EXTERNAL_SURROUND_SOUND_KEY = "use_external_surround_sound_flag";
    private final SparseArray<AudioProfile> encodingToAudioProfile;
    private final int maxChannelCount;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(ImmutableList.of(AudioProfile.DEFAULT_AUDIO_PROFILE));

    @SuppressLint({"InlinedApi"})
    private static final ImmutableList<Integer> EXTERNAL_SURROUND_SOUND_ENCODINGS = ImmutableList.of(2, 5, 6);

    @VisibleForTesting
    static final ImmutableMap<Integer, Integer> ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = new ImmutableMap.b().i(5, 6).i(17, 6).i(7, 6).i(30, 10).i(18, 6).i(6, 8).i(8, 8).i(14, 8).d();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static final class Api23 {
        private Api23() {
        }

        private static ImmutableSet<Integer> getAllBluetoothDeviceTypes() {
            ImmutableSet.a b11 = new ImmutableSet.a().b(8, 7);
            int i11 = Util.SDK_INT;
            if (i11 >= 31) {
                b11.b(26, 27);
            }
            if (i11 >= 33) {
                b11.a(30);
            }
            return b11.e();
        }

        public static boolean isBluetoothConnected(AudioManager audioManager, @Nullable AudioDeviceInfoApi23 audioDeviceInfoApi23) {
            AudioDeviceInfo[] devices = audioDeviceInfoApi23 == null ? ((AudioManager) Assertions.checkNotNull(audioManager)).getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfoApi23.audioDeviceInfo};
            ImmutableSet<Integer> allBluetoothDeviceTypes = getAllBluetoothDeviceTypes();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (allBluetoothDeviceTypes.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static final class Api29 {
        private Api29() {
        }

        public static ImmutableList<Integer> getDirectPlaybackSupportedEncodings(AudioAttributes audioAttributes) {
            boolean isDirectPlaybackSupported;
            ImmutableList.a builder = ImmutableList.builder();
            aa<Integer> it = AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int intValue = next.intValue();
                if (Util.SDK_INT >= Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), audioAttributes.getAudioAttributesV21().audioAttributes);
                    if (isDirectPlaybackSupported) {
                        builder.g(next);
                    }
                }
            }
            builder.g(2);
            return builder.e();
        }

        public static int getMaxSupportedChannelCountForPassthrough(int i11, int i12, AudioAttributes audioAttributes) {
            boolean isDirectPlaybackSupported;
            for (int i13 = 10; i13 > 0; i13--) {
                int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i13);
                if (audioTrackChannelConfig != 0) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i12).setChannelMask(audioTrackChannelConfig).build(), audioAttributes.getAudioAttributesV21().audioAttributes);
                    if (isDirectPlaybackSupported) {
                        return i13;
                    }
                }
            }
            return 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(33)
    public static final class Api33 {
        private Api33() {
        }

        public static AudioCapabilities getCapabilitiesInternalForDirectPlayback(AudioManager audioManager, AudioAttributes audioAttributes) {
            List directProfilesForAttributes;
            directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(audioAttributes.getAudioAttributesV21().audioAttributes);
            return new AudioCapabilities(AudioCapabilities.getAudioProfiles(directProfilesForAttributes));
        }

        @Nullable
        public static AudioDeviceInfoApi23 getDefaultRoutedDeviceForAttributes(AudioManager audioManager, AudioAttributes audioAttributes) {
            List audioDevicesForAttributes;
            try {
                audioDevicesForAttributes = ((AudioManager) Assertions.checkNotNull(audioManager)).getAudioDevicesForAttributes(audioAttributes.getAudioAttributesV21().audioAttributes);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new AudioDeviceInfoApi23((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(33)
    @SuppressLint({"WrongConstant"})
    public static ImmutableList<AudioProfile> getAudioProfiles(List<android.media.AudioProfile> list) {
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(ro.i.c(12)));
        for (int i11 = 0; i11 < list.size(); i11++) {
            android.media.AudioProfile a11 = a.a(list.get(i11));
            encapsulationType = a11.getEncapsulationType();
            if (encapsulationType != 1) {
                format = a11.getFormat();
                if (Util.isEncodingLinearPcm(format) || ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) Assertions.checkNotNull((Set) hashMap.get(Integer.valueOf(format)));
                        channelMasks2 = a11.getChannelMasks();
                        set.addAll(ro.i.c(channelMasks2));
                    } else {
                        Integer valueOf = Integer.valueOf(format);
                        channelMasks = a11.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(ro.i.c(channelMasks)));
                    }
                }
            }
        }
        ImmutableList.a builder = ImmutableList.builder();
        for (Map.Entry entry : hashMap.entrySet()) {
            builder.g(new AudioProfile(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return builder.e();
    }

    @Deprecated
    public static AudioCapabilities getCapabilities(Context context) {
        return getCapabilities(context, AudioAttributes.DEFAULT, null);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static AudioCapabilities getCapabilitiesInternal(Context context, AudioAttributes audioAttributes, @Nullable AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        return getCapabilitiesInternal(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), audioAttributes, audioDeviceInfoApi23);
    }

    private static int getChannelConfigForPassthrough(int i11) {
        int i12 = Util.SDK_INT;
        if (i12 <= 28) {
            if (i11 == 7) {
                i11 = 8;
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                i11 = 6;
            }
        }
        if (i12 <= 26 && "fugu".equals(Build.DEVICE) && i11 == 1) {
            i11 = 2;
        }
        return Util.getAudioTrackChannelConfig(i11);
    }

    @Nullable
    public static Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return Settings.Global.getUriFor(EXTERNAL_SURROUND_SOUND_KEY);
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return Util.contentEquals(this.encodingToAudioProfile, audioCapabilities.encodingToAudioProfile) && this.maxChannelCount == audioCapabilities.maxChannelCount;
    }

    @Nullable
    @Deprecated
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format) {
        return getEncodingAndChannelConfigForPassthrough(format, AudioAttributes.DEFAULT);
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public int hashCode() {
        return this.maxChannelCount + (Util.contentHashCode(this.encodingToAudioProfile) * 31);
    }

    @Deprecated
    public boolean isPassthroughPlaybackSupported(Format format) {
        return isPassthroughPlaybackSupported(format, AudioAttributes.DEFAULT);
    }

    public boolean supportsEncoding(int i11) {
        return Util.contains(this.encodingToAudioProfile, i11);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", audioProfiles=" + this.encodingToAudioProfile + "]";
    }

    @Deprecated
    public AudioCapabilities(@Nullable int[] iArr, int i11) {
        this(getAudioProfiles(iArr, i11));
    }

    public static AudioCapabilities getCapabilities(Context context, AudioAttributes audioAttributes, @Nullable AudioDeviceInfo audioDeviceInfo) {
        return getCapabilitiesInternal(context, audioAttributes, (Util.SDK_INT < 23 || audioDeviceInfo == null) ? null : new AudioDeviceInfoApi23(audioDeviceInfo));
    }

    @Nullable
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format, AudioAttributes audioAttributes) {
        int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        if (!ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(encoding))) {
            return null;
        }
        if (encoding == 18 && !supportsEncoding(18)) {
            encoding = 6;
        } else if ((encoding == 8 && !supportsEncoding(8)) || (encoding == 30 && !supportsEncoding(30))) {
            encoding = 7;
        }
        if (!supportsEncoding(encoding)) {
            return null;
        }
        AudioProfile audioProfile = (AudioProfile) Assertions.checkNotNull(this.encodingToAudioProfile.get(encoding));
        int i11 = format.channelCount;
        if (i11 == -1 || encoding == 18) {
            int i12 = format.sampleRate;
            if (i12 == -1) {
                i12 = 48000;
            }
            i11 = audioProfile.getMaxSupportedChannelCountForPassthrough(i12, audioAttributes);
        } else if (!format.sampleMimeType.equals(MimeTypes.AUDIO_DTS_X) || Util.SDK_INT >= 33) {
            if (!audioProfile.supportsChannelCount(i11)) {
                return null;
            }
        } else if (i11 > 10) {
            return null;
        }
        int channelConfigForPassthrough = getChannelConfigForPassthrough(i11);
        if (channelConfigForPassthrough == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(encoding), Integer.valueOf(channelConfigForPassthrough));
    }

    public boolean isPassthroughPlaybackSupported(Format format, AudioAttributes audioAttributes) {
        return getEncodingAndChannelConfigForPassthrough(format, audioAttributes) != null;
    }

    private AudioCapabilities(List<AudioProfile> list) {
        this.encodingToAudioProfile = new SparseArray<>();
        for (int i11 = 0; i11 < list.size(); i11++) {
            AudioProfile audioProfile = list.get(i11);
            this.encodingToAudioProfile.put(audioProfile.encoding, audioProfile);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.encodingToAudioProfile.size(); i13++) {
            i12 = Math.max(i12, this.encodingToAudioProfile.valueAt(i13).maxChannelCount);
        }
        this.maxChannelCount = i12;
    }

    @SuppressLint({"InlinedApi"})
    public static AudioCapabilities getCapabilitiesInternal(Context context, @Nullable Intent intent, AudioAttributes audioAttributes, @Nullable AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        AudioManager audioManager = AudioManagerCompat.getAudioManager(context);
        if (audioDeviceInfoApi23 == null) {
            audioDeviceInfoApi23 = Util.SDK_INT >= 33 ? Api33.getDefaultRoutedDeviceForAttributes(audioManager, audioAttributes) : null;
        }
        int i11 = Util.SDK_INT;
        if (i11 >= 33 && (Util.isTv(context) || Util.isAutomotive(context))) {
            return Api33.getCapabilitiesInternalForDirectPlayback(audioManager, audioAttributes);
        }
        if (i11 >= 23 && Api23.isBluetoothConnected(audioManager, audioDeviceInfoApi23)) {
            return DEFAULT_AUDIO_CAPABILITIES;
        }
        ImmutableSet.a aVar = new ImmutableSet.a();
        aVar.a(2);
        if (i11 >= 29 && (Util.isTv(context) || Util.isAutomotive(context))) {
            aVar.c(Api29.getDirectPlaybackSupportedEncodings(audioAttributes));
            return new AudioCapabilities(getAudioProfiles(ro.i.E(aVar.e()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z11 = Settings.Global.getInt(contentResolver, FORCE_EXTERNAL_SURROUND_SOUND_KEY, 0) == 1;
        if ((z11 || deviceMaySetExternalSurroundSoundGlobalSetting()) && Settings.Global.getInt(contentResolver, EXTERNAL_SURROUND_SOUND_KEY, 0) == 1) {
            aVar.c(EXTERNAL_SURROUND_SOUND_ENCODINGS);
        }
        if (intent != null && !z11 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                aVar.c(ro.i.c(intArrayExtra));
            }
            return new AudioCapabilities(getAudioProfiles(ro.i.E(aVar.e()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new AudioCapabilities(getAudioProfiles(ro.i.E(aVar.e()), 10));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class AudioProfile {
        public static final AudioProfile DEFAULT_AUDIO_PROFILE;

        @Nullable
        private final ImmutableSet<Integer> channelMasks;
        public final int encoding;
        public final int maxChannelCount;

        static {
            DEFAULT_AUDIO_PROFILE = Util.SDK_INT >= 33 ? new AudioProfile(2, getAllChannelMasksForMaxChannelCount(10)) : new AudioProfile(2, 10);
        }

        @RequiresApi(33)
        public AudioProfile(int i11, Set<Integer> set) {
            this.encoding = i11;
            ImmutableSet<Integer> copyOf = ImmutableSet.copyOf((Collection) set);
            this.channelMasks = copyOf;
            aa<Integer> it = copyOf.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                i12 = Math.max(i12, Integer.bitCount(it.next().intValue()));
            }
            this.maxChannelCount = i12;
        }

        private static ImmutableSet<Integer> getAllChannelMasksForMaxChannelCount(int i11) {
            ImmutableSet.a aVar = new ImmutableSet.a();
            for (int i12 = 1; i12 <= i11; i12++) {
                aVar.a(Integer.valueOf(Util.getAudioTrackChannelConfig(i12)));
            }
            return aVar.e();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioProfile)) {
                return false;
            }
            AudioProfile audioProfile = (AudioProfile) obj;
            return this.encoding == audioProfile.encoding && this.maxChannelCount == audioProfile.maxChannelCount && Objects.equals(this.channelMasks, audioProfile.channelMasks);
        }

        public int getMaxSupportedChannelCountForPassthrough(int i11, AudioAttributes audioAttributes) {
            return this.channelMasks != null ? this.maxChannelCount : Util.SDK_INT >= 29 ? Api29.getMaxSupportedChannelCountForPassthrough(this.encoding, i11, audioAttributes) : ((Integer) Assertions.checkNotNull(AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.getOrDefault(Integer.valueOf(this.encoding), 0))).intValue();
        }

        public int hashCode() {
            int i11 = ((this.encoding * 31) + this.maxChannelCount) * 31;
            ImmutableSet<Integer> immutableSet = this.channelMasks;
            return i11 + (immutableSet == null ? 0 : immutableSet.hashCode());
        }

        public boolean supportsChannelCount(int i11) {
            if (this.channelMasks == null) {
                return i11 <= this.maxChannelCount;
            }
            int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i11);
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            return this.channelMasks.contains(Integer.valueOf(audioTrackChannelConfig));
        }

        public String toString() {
            return "AudioProfile[format=" + this.encoding + ", maxChannelCount=" + this.maxChannelCount + ", channelMasks=" + this.channelMasks + "]";
        }

        public AudioProfile(int i11, int i12) {
            this.encoding = i11;
            this.maxChannelCount = i12;
            this.channelMasks = null;
        }
    }

    private static ImmutableList<AudioProfile> getAudioProfiles(@Nullable int[] iArr, int i11) {
        ImmutableList.a builder = ImmutableList.builder();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i12 : iArr) {
            builder.g(new AudioProfile(i12, i11));
        }
        return builder.e();
    }
}
