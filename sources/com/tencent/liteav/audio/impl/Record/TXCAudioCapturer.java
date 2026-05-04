package com.tencent.liteav.audio.impl.Record;

import android.media.AudioRecord;
import android.os.Process;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class TXCAudioCapturer {
    private static final String TAG = "TXCAudioCapturer";
    private AudioRecord mAudioRecord;

    private static String audioSourceToText(int i11) {
        if (i11 == 1) {
            return "MIC";
        }
        if (i11 == 7) {
            return "VOICE_COMMUNICATION";
        }
        return "UNSUPPORT " + i11;
    }

    private static AudioRecord createStartedAudioRecord(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        AudioRecord audioRecord;
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
            audioRecord = new AudioRecord(i15, i16, i17, 2, i18);
        } catch (Exception unused2) {
            audioRecord = null;
            TXCLog.w(TAG, "create AudioRecord failed. source: %s, samplerate: %d, channelConfig: %d, bufferSize: %d", audioSourceToText(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18));
            tearDownAudioRecord(audioRecord);
            return null;
        }
        try {
            if (audioRecord.getState() != 1) {
                throw new RuntimeException("AudioRecord is not initialized.");
            }
            audioRecord.startRecording();
            return audioRecord;
        } catch (Exception unused3) {
            TXCLog.w(TAG, "create AudioRecord failed. source: %s, samplerate: %d, channelConfig: %d, bufferSize: %d", audioSourceToText(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18));
            tearDownAudioRecord(audioRecord);
            return null;
        }
    }

    private static void tearDownAudioRecord(AudioRecord audioRecord) {
        if (audioRecord == null) {
            return;
        }
        try {
            if (audioRecord.getRecordingState() == 3) {
                audioRecord.stop();
            }
            audioRecord.release();
        } catch (Exception e11) {
            TXCLog.e(TAG, "stop AudioRecord failed.", e11);
        }
    }

    public int read(ByteBuffer byteBuffer, int i11) {
        if (this.mAudioRecord == null) {
            return -1;
        }
        byteBuffer.position(0);
        int read = this.mAudioRecord.read(byteBuffer, i11);
        if (read > 0) {
            return read;
        }
        TXCLog.e(TAG, "read failed, %d", Integer.valueOf(read));
        return -1;
    }

    public boolean startRecord(int i11, int i12, int i13, int i14) {
        int[] iArr = {i11, 1, 5, 0};
        int i15 = i13 == 1 ? 16 : 12;
        int minBufferSize = AudioRecord.getMinBufferSize(i12, i15, 2);
        for (int i16 = 0; i16 < 4 && this.mAudioRecord == null; i16++) {
            int i17 = iArr[i16];
            for (int i18 = 1; i18 <= 2 && this.mAudioRecord == null; i18++) {
                int i19 = minBufferSize * i18;
                if (i19 >= i14 * 4 || i18 >= 2) {
                    this.mAudioRecord = createStartedAudioRecord(i17, i12, i15, i19);
                }
            }
        }
        Thread.currentThread().setName("tx_audio_capturer");
        Process.setThreadPriority(-19);
        return this.mAudioRecord != null;
    }

    public void stopRecord() {
        tearDownAudioRecord(this.mAudioRecord);
        this.mAudioRecord = null;
    }
}
