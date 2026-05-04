package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ToFloatPcmAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private static final int FLOAT_NAN_AS_INT = Float.floatToIntBits(Float.NaN);
    private static final double PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR = 4.656612875245797E-10d;

    private static void writePcm32BitFloat(int i11, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i11 * PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR));
        if (floatToIntBits == FLOAT_NAN_AS_INT) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i11 = audioFormat.encoding;
        if (Util.isEncodingHighResolutionPcm(i11)) {
            return i11 != 4 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 4) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer replaceOutputBuffer;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = limit - position;
        int i12 = this.inputAudioFormat.encoding;
        if (i12 == 21) {
            replaceOutputBuffer = replaceOutputBuffer((i11 / 3) * 4);
            while (position < limit) {
                writePcm32BitFloat(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), replaceOutputBuffer);
                position += 3;
            }
        } else if (i12 == 22) {
            replaceOutputBuffer = replaceOutputBuffer(i11);
            while (position < limit) {
                writePcm32BitFloat((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), replaceOutputBuffer);
                position += 4;
            }
        } else if (i12 == 1342177280) {
            replaceOutputBuffer = replaceOutputBuffer((i11 / 3) * 4);
            while (position < limit) {
                writePcm32BitFloat(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), replaceOutputBuffer);
                position += 3;
            }
        } else {
            if (i12 != 1610612736) {
                throw new IllegalStateException();
            }
            replaceOutputBuffer = replaceOutputBuffer(i11);
            while (position < limit) {
                writePcm32BitFloat((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), replaceOutputBuffer);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        replaceOutputBuffer.flip();
    }
}
