package com.baicizhan.client.business.webview.sdk;

import android.app.Activity;
import android.content.Context;
import android.media.MediaRecorder;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.hms.iap.entity.OrderStatusCode;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AudioRecordMgr implements MediaRecorder.OnInfoListener, MediaRecorder.OnErrorListener {
    private static final int REQUEST_PERMISSION = 103;
    private static final int SAMPLE_RATE = 8000;
    public static final String TAG = "AudioRecordMgr";
    private WeakReference<Context> mContext;
    private AudioListener mListener;
    private MediaRecorder mMediaRecorder;
    private long mStartTime;
    private qb0.h mSub;
    private sa.h permissionBanner;
    private String mFilePath = null;
    private int mMaxDuration = OrderStatusCode.ORDER_STATE_CANCEL;
    private int mSampleRate = 8000;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AudioListener {
        void onError(String error);

        void onPermission(boolean permission);

        void onStart();

        void onStop(String file, long duration, int sample);
    }

    public AudioRecordMgr(Context context) {
        this.mContext = new WeakReference<>(context);
    }

    private void createFile() {
        Context context = this.mContext.get();
        if (context != null) {
            File file = new File(context.getCacheDir(), "webview/audio_record/cache.aac");
            file.getParentFile().mkdirs();
            this.mFilePath = file.getAbsolutePath();
        }
    }

    private String keyGen() {
        return "record" + System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecord$0(Long l11) {
        stopRecord();
    }

    public boolean hasAudioPremission() {
        return ContextCompat.checkSelfPermission(this.mContext.get(), "android.permission.RECORD_AUDIO") == 0;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public void onError(MediaRecorder mr2, int what, int extra) {
        qb.c.d(TAG, "%d %d", Integer.valueOf(what), Integer.valueOf(extra));
        AudioListener audioListener = this.mListener;
        if (audioListener != null) {
            audioListener.onError("error what =" + what + " extra =" + extra);
        }
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public void onInfo(MediaRecorder mr2, int what, int extra) {
        qb.c.d(TAG, "%d %d", Integer.valueOf(what), Integer.valueOf(extra));
        if (what != 800 || this.mListener == null) {
            return;
        }
        try {
            String keyGen = keyGen();
            H5FileCache.inst().save(String.valueOf(keyGen.hashCode()), new File(this.mFilePath));
            this.mListener.onStop(keyGen, System.currentTimeMillis() - this.mStartTime, this.mSampleRate);
        } catch (Exception e11) {
            this.mListener.onError(e11.getMessage());
            qb.c.c(TAG, "", e11);
        }
    }

    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        AudioListener audioListener;
        sa.h hVar = this.permissionBanner;
        if (hVar != null) {
            hVar.f();
        }
        if (requestCode != 103 || (audioListener = this.mListener) == null) {
            return;
        }
        audioListener.onPermission(hasAudioPremission());
    }

    public void release() {
        stopRecord();
        this.mContext = null;
    }

    public void requestPermission(Activity activity) {
        if (ContextCompat.checkSelfPermission(activity, "android.permission.RECORD_AUDIO") != 0) {
            this.permissionBanner.j("android.permission.RECORD_AUDIO");
            this.permissionBanner = new sa.h(activity);
            ActivityCompat.requestPermissions(activity, new String[]{"android.permission.RECORD_AUDIO"}, 103);
        }
    }

    public void setListener(AudioListener audioListener) {
        this.mListener = audioListener;
    }

    public void setMaxDuration(int maxDuration) {
        this.mMaxDuration = maxDuration;
    }

    public void setSampleRate(int sampleRate) {
        this.mSampleRate = sampleRate;
    }

    public void startRecord() {
        qb.c.i(TAG, "", new Object[0]);
        qb0.h hVar = this.mSub;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.mSub.unsubscribe();
            this.mSub = null;
        }
        MediaRecorder mediaRecorder = this.mMediaRecorder;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
                this.mMediaRecorder.release();
                this.mMediaRecorder = null;
            } catch (Exception e11) {
                qb.c.c(TAG, "", e11);
            }
        }
        try {
            createFile();
            MediaRecorder mediaRecorder2 = new MediaRecorder();
            this.mMediaRecorder = mediaRecorder2;
            mediaRecorder2.setAudioSource(1);
            this.mMediaRecorder.setOutputFormat(2);
            this.mMediaRecorder.setOutputFile(this.mFilePath);
            this.mMediaRecorder.setAudioEncoder(3);
            this.mMediaRecorder.setAudioChannels(1);
            int i11 = this.mMaxDuration;
            if (i11 != 0) {
                this.mSub = rx.c.o6(i11, TimeUnit.MILLISECONDS).t5(new wb0.b() { // from class: com.baicizhan.client.business.webview.sdk.a
                    @Override // wb0.b
                    public final void call(Object obj) {
                        AudioRecordMgr.this.lambda$startRecord$0((Long) obj);
                    }
                });
            }
            this.mMediaRecorder.setAudioSamplingRate(this.mSampleRate);
            this.mMediaRecorder.setAudioEncodingBitRate(this.mSampleRate * 3);
            this.mMediaRecorder.setOnInfoListener(this);
            this.mMediaRecorder.setOnErrorListener(this);
            this.mMediaRecorder.prepare();
            this.mMediaRecorder.start();
            AudioListener audioListener = this.mListener;
            if (audioListener != null) {
                audioListener.onStart();
            }
            this.mStartTime = System.currentTimeMillis();
        } catch (Exception e12) {
            qb.c.c(TAG, "", e12);
            AudioListener audioListener2 = this.mListener;
            if (audioListener2 != null) {
                audioListener2.onError(e12.getMessage());
            }
        }
    }

    public void stopRecord() {
        qb.c.i(TAG, "", new Object[0]);
        qb0.h hVar = this.mSub;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.mSub.unsubscribe();
            this.mSub = null;
        }
        try {
            MediaRecorder mediaRecorder = this.mMediaRecorder;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
                this.mMediaRecorder.release();
                this.mMediaRecorder = null;
            }
            File file = new File(this.mFilePath);
            if (this.mListener != null) {
                if (!file.exists() || file.length() <= 0) {
                    this.mListener.onError("record error, file not exists");
                    return;
                }
                try {
                    String keyGen = keyGen();
                    H5FileCache.inst().save(String.valueOf(keyGen.hashCode()), file);
                    this.mListener.onStop(keyGen, System.currentTimeMillis() - this.mStartTime, this.mSampleRate);
                } catch (Exception e11) {
                    this.mListener.onError(e11.getMessage());
                    qb.c.c(TAG, "", e11);
                }
            }
        } catch (Exception e12) {
            AudioListener audioListener = this.mListener;
            if (audioListener != null) {
                audioListener.onError(e12.getMessage());
            }
        }
    }

    public void requestPermission(Fragment fragment) {
        if (ContextCompat.checkSelfPermission(fragment.requireContext(), "android.permission.RECORD_AUDIO") != 0) {
            sa.h hVar = new sa.h(fragment.requireActivity());
            this.permissionBanner = hVar;
            hVar.j("android.permission.RECORD_AUDIO");
            fragment.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 103);
        }
    }
}
