package com.baicizhan.main.plusreview.data;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import java.io.File;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import rf.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class AudioRecorderModel extends AndroidViewModel {
    private static final int MAX_DURATION = 10000;

    @k
    private final h audioRecorder;

    @k
    private final MutableLiveData<File> recordingFile;

    @k
    private final File tmpRecordFile;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecorderModel(@k Application application) {
        super(application);
        g0.p(application, "application");
        this.audioRecorder = new h();
        File file = new File(application.getFilesDir(), "word_reading_tmp.aac");
        this.tmpRecordFile = file;
        MutableLiveData<File> mutableLiveData = new MutableLiveData<>();
        this.recordingFile = mutableLiveData;
        mutableLiveData.setValue(file);
    }

    @k
    public final MutableLiveData<File> getRecordingFile() {
        return this.recordingFile;
    }

    public final void setListener(@l h.b bVar) {
        this.audioRecorder.g(bVar);
    }

    public final void start() {
        h hVar = this.audioRecorder;
        String absolutePath = this.tmpRecordFile.getAbsolutePath();
        g0.o(absolutePath, "getAbsolutePath(...)");
        h.i(hVar, absolutePath, 10000, false, 4, null);
    }

    public final void stop() {
        this.audioRecorder.l();
    }
}
