package com.tencent.liteav.audio.impl.Play;

import android.media.AudioTrack;
import android.os.Process;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCAudioPlayout {
    private static final String TAG = "TXCAudioPlayout";
    private AudioTrack mAudioTrack;
    private byte[] mPlayBuffer;

    private static AudioTrack createStartedAudioTrack(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        AudioTrack audioTrack;
        try {
            i15 = i11;
            i16 = i12;
            i17 = i13;
            i18 = i14;
        } catch (Exception unused) {
            i15 = i11;
            i16 = i12;
            i17 = i13;
            i18 = i14;
        }
        try {
            audioTrack = new AudioTrack(i18, i15, i16, 2, i17, 1);
        } catch (Exception unused2) {
            audioTrack = null;
            TXCLog.w(TAG, "create AudioTrack failed. samplerate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), streamTypeToText(i18));
            tearDownAudioTrack(audioTrack);
            return null;
        }
        try {
            if (audioTrack.getState() != 1) {
                throw new RuntimeException("AudioTrack is not initialized.");
            }
            audioTrack.play();
            TXCLog.i(TAG, "create AudioTrack success. samplerate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), streamTypeToText(i18));
            return audioTrack;
        } catch (Exception unused3) {
            TXCLog.w(TAG, "create AudioTrack failed. samplerate: %d, channelConfig: %d, bufferSize: %d, streamType: %s", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), streamTypeToText(i18));
            tearDownAudioTrack(audioTrack);
            return null;
        }
    }

    private static String streamTypeToText(int i11) {
        if (i11 == 0) {
            return "STREAM_VOICE_CALL";
        }
        if (i11 == 3) {
            return "STREAM_MUSIC";
        }
        return "UNSUPPORT " + i11;
    }

    private static void tearDownAudioTrack(AudioTrack audioTrack) {
        if (audioTrack == null) {
            return;
        }
        try {
            if (audioTrack.getPlayState() == 3) {
                audioTrack.stop();
                audioTrack.flush();
            }
            audioTrack.release();
        } catch (Exception e11) {
            TXCLog.e(TAG, "stop AudioTrack failed.", e11);
        }
    }

    public boolean startPlayout(int i11, int i12, int i13, int i14) {
        int[] iArr = {i14, 0, 3, 1};
        int i15 = i12 == 1 ? 4 : 12;
        int minBufferSize = AudioTrack.getMinBufferSize(i11, i15, 2);
        for (int i16 = 0; i16 < 4 && this.mAudioTrack == null; i16++) {
            int i17 = iArr[i16];
            for (int i18 = 1; i18 <= 2 && this.mAudioTrack == null; i18++) {
                if (minBufferSize * i18 >= i13 * 4 || i18 >= 2) {
                    this.mAudioTrack = createStartedAudioTrack(i11, i15, i13, i17);
                }
            }
        }
        Thread.currentThread().setName("tx_audio_playout");
        Process.setThreadPriority(-19);
        return this.mAudioTrack != null;
    }

    public void stopPlayout() {
        tearDownAudioTrack(this.mAudioTrack);
        this.mAudioTrack = null;
    }

    public int write(ByteBuffer byteBuffer, int i11, int i12) {
        if (this.mAudioTrack == null) {
            return -1;
        }
        byteBuffer.position(i11);
        int write = this.mAudioTrack.write(byteBuffer, i12, 0);
        if (write > 0) {
            return write;
        }
        TXCLog.e(TAG, "write audio data to AudioTrack failed. " + write);
        return -1;
    }
}
