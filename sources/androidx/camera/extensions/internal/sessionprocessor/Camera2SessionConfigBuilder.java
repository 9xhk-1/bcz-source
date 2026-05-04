package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class Camera2SessionConfigBuilder {
    private int mSessionTemplateId = 1;
    private int mSessionType = 0;
    private Map<CaptureRequest.Key<?>, Object> mSessionParameters = new HashMap();
    private List<Camera2OutputConfig> mCamera2OutputConfigs = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SessionConfigImpl implements Camera2SessionConfig {
        private final List<Camera2OutputConfig> mCamera2OutputConfigs;
        private final Map<CaptureRequest.Key<?>, Object> mSessionParameters;
        private final int mSessionTemplateId;
        private final int mSessionType;

        public SessionConfigImpl(int i11, int i12, Map<CaptureRequest.Key<?>, Object> map, List<Camera2OutputConfig> list) {
            this.mSessionTemplateId = i11;
            this.mSessionType = i12;
            this.mSessionParameters = map;
            this.mCamera2OutputConfigs = list;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig
        @NonNull
        public List<Camera2OutputConfig> getOutputConfigs() {
            return this.mCamera2OutputConfigs;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig
        @NonNull
        public Map<CaptureRequest.Key<?>, Object> getSessionParameters() {
            return this.mSessionParameters;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig
        public int getSessionTemplateId() {
            return this.mSessionTemplateId;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig
        public int getSessionType() {
            return this.mSessionType;
        }
    }

    @NonNull
    public Camera2SessionConfigBuilder addOutputConfig(@NonNull Camera2OutputConfig camera2OutputConfig) {
        this.mCamera2OutputConfigs.add(camera2OutputConfig);
        return this;
    }

    @NonNull
    public Camera2SessionConfigBuilder addSessionParameter(@NonNull CaptureRequest.Key key, @Nullable Object obj) {
        this.mSessionParameters.put(key, obj);
        return this;
    }

    @NonNull
    public Camera2SessionConfig build() {
        return new SessionConfigImpl(this.mSessionTemplateId, this.mSessionType, this.mSessionParameters, this.mCamera2OutputConfigs);
    }

    @NonNull
    public List<Camera2OutputConfig> getCamera2OutputConfigs() {
        return this.mCamera2OutputConfigs;
    }

    @NonNull
    public Map<CaptureRequest.Key<?>, Object> getSessionParameters() {
        return this.mSessionParameters;
    }

    public int getSessionTemplateId() {
        return this.mSessionTemplateId;
    }

    @NonNull
    public Camera2SessionConfigBuilder setSessionTemplateId(int i11) {
        this.mSessionTemplateId = i11;
        return this;
    }

    @NonNull
    public Camera2SessionConfigBuilder setSessionType(int i11) {
        this.mSessionType = i11;
        return this;
    }
}
