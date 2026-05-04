package androidx.camera.camera2.internal.compat.params;

import android.annotation.SuppressLint;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class InputConfigurationCompat {
    private final InputConfigurationCompatImpl mImpl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(31)
    public static final class InputConfigurationCompatApi31Impl extends InputConfigurationCompatApi23Impl {
        public InputConfigurationCompatApi31Impl(@NonNull Object obj) {
            super(obj);
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatApi23Impl, androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public boolean isMultiResolution() {
            return ((InputConfiguration) getInputConfiguration()).isMultiResolution();
        }

        public InputConfigurationCompatApi31Impl(int i11, int i12, int i13) {
            super(i11, i12, i13);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static final class InputConfigurationCompatBaseImpl implements InputConfigurationCompatImpl {
        private final int mFormat;
        private final int mHeight;
        private final int mWidth;

        public InputConfigurationCompatBaseImpl(int i11, int i12, int i13) {
            this.mWidth = i11;
            this.mHeight = i12;
            this.mFormat = i13;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof InputConfigurationCompatBaseImpl)) {
                return false;
            }
            InputConfigurationCompatBaseImpl inputConfigurationCompatBaseImpl = (InputConfigurationCompatBaseImpl) obj;
            return inputConfigurationCompatBaseImpl.getWidth() == this.mWidth && inputConfigurationCompatBaseImpl.getHeight() == this.mHeight && inputConfigurationCompatBaseImpl.getFormat() == this.mFormat;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getFormat() {
            return this.mFormat;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getHeight() {
            return this.mHeight;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public Object getInputConfiguration() {
            return null;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getWidth() {
            return this.mWidth;
        }

        public int hashCode() {
            int i11 = 31 ^ this.mWidth;
            int i12 = this.mHeight ^ ((i11 << 5) - i11);
            return this.mFormat ^ ((i12 << 5) - i12);
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public boolean isMultiResolution() {
            return false;
        }

        @NonNull
        @SuppressLint({"DefaultLocale"})
        public String toString() {
            return String.format("InputConfiguration(w:%d, h:%d, format:%d)", Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight), Integer.valueOf(this.mFormat));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface InputConfigurationCompatImpl {
        int getFormat();

        int getHeight();

        @Nullable
        Object getInputConfiguration();

        int getWidth();

        boolean isMultiResolution();
    }

    public InputConfigurationCompat(int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.mImpl = new InputConfigurationCompatApi31Impl(i11, i12, i13);
        } else {
            this.mImpl = new InputConfigurationCompatApi23Impl(i11, i12, i13);
        }
    }

    @Nullable
    public static InputConfigurationCompat wrap(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new InputConfigurationCompat(new InputConfigurationCompatApi31Impl(obj)) : new InputConfigurationCompat(new InputConfigurationCompatApi23Impl(obj));
    }

    public boolean equals(Object obj) {
        if (obj instanceof InputConfigurationCompat) {
            return this.mImpl.equals(((InputConfigurationCompat) obj).mImpl);
        }
        return false;
    }

    public int getFormat() {
        return this.mImpl.getFormat();
    }

    public int getHeight() {
        return this.mImpl.getHeight();
    }

    public int getWidth() {
        return this.mImpl.getWidth();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public boolean isMultiResolution() {
        return this.mImpl.isMultiResolution();
    }

    @NonNull
    public String toString() {
        return this.mImpl.toString();
    }

    @Nullable
    public Object unwrap() {
        return this.mImpl.getInputConfiguration();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class InputConfigurationCompatApi23Impl implements InputConfigurationCompatImpl {
        private final InputConfiguration mObject;

        public InputConfigurationCompatApi23Impl(@NonNull Object obj) {
            this.mObject = (InputConfiguration) obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof InputConfigurationCompatImpl) {
                return Objects.equals(this.mObject, ((InputConfigurationCompatImpl) obj).getInputConfiguration());
            }
            return false;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getFormat() {
            return this.mObject.getFormat();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getHeight() {
            return this.mObject.getHeight();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        @Nullable
        public Object getInputConfiguration() {
            return this.mObject;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getWidth() {
            return this.mObject.getWidth();
        }

        public int hashCode() {
            return this.mObject.hashCode();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public boolean isMultiResolution() {
            return false;
        }

        @NonNull
        public String toString() {
            return this.mObject.toString();
        }

        public InputConfigurationCompatApi23Impl(int i11, int i12, int i13) {
            this(new InputConfiguration(i11, i12, i13));
        }
    }

    private InputConfigurationCompat(@NonNull InputConfigurationCompatImpl inputConfigurationCompatImpl) {
        this.mImpl = inputConfigurationCompatImpl;
    }
}
