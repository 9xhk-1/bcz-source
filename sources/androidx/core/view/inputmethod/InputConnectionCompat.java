package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes2.dex */
public final class InputConnectionCompat {
    private static final String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final String EXTRA_INPUT_CONTENT_INFO = "androidx.core.view.extra.INPUT_CONTENT_INFO";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
    private static final String LOG_TAG = "InputConnectionCompat";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(25)
    public static class Api25Impl {
        private Api25Impl() {
        }

        @DoNotInline
        public static boolean commitContent(InputConnection inputConnection, InputContentInfo inputContentInfo, int i11, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i11, bundle);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnCommitContentListener {
        boolean onCommitContent(@NonNull InputContentInfoCompat inputContentInfoCompat, int i11, @Nullable Bundle bundle);
    }

    @Deprecated
    public InputConnectionCompat() {
    }

    public static /* synthetic */ boolean a(View view, InputContentInfoCompat inputContentInfoCompat, int i11, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i11 & 1) != 0) {
            try {
                inputContentInfoCompat.requestPermission();
                Parcelable parcelable = (Parcelable) inputContentInfoCompat.unwrap();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable(EXTRA_INPUT_CONTENT_INFO, parcelable);
            } catch (Exception e11) {
                Log.w(LOG_TAG, "Can't insert content from IME; requestPermission() failed", e11);
                return false;
            }
        }
        return ViewCompat.performReceiveContent(view, new ContentInfoCompat.Builder(new ClipData(inputContentInfoCompat.getDescription(), new ClipData.Item(inputContentInfoCompat.getContentUri())), 2).setLinkUri(inputContentInfoCompat.getLinkUri()).setExtras(bundle).build()) == null;
    }

    public static boolean commitContent(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull InputContentInfoCompat inputContentInfoCompat, int i11, @Nullable Bundle bundle) {
        boolean z11;
        if (Build.VERSION.SDK_INT >= 25) {
            return Api25Impl.commitContent(inputConnection, c.a(inputContentInfoCompat.unwrap()), i11, bundle);
        }
        int protocol = EditorInfoCompat.getProtocol(editorInfo);
        if (protocol != 2) {
            z11 = false;
            if (protocol != 3 && protocol != 4) {
                return false;
            }
        } else {
            z11 = true;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(z11 ? COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY : COMMIT_CONTENT_CONTENT_URI_KEY, inputContentInfoCompat.getContentUri());
        bundle2.putParcelable(z11 ? COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY : COMMIT_CONTENT_DESCRIPTION_KEY, inputContentInfoCompat.getDescription());
        bundle2.putParcelable(z11 ? COMMIT_CONTENT_LINK_URI_INTEROP_KEY : COMMIT_CONTENT_LINK_URI_KEY, inputContentInfoCompat.getLinkUri());
        bundle2.putInt(z11 ? COMMIT_CONTENT_FLAGS_INTEROP_KEY : COMMIT_CONTENT_FLAGS_KEY, i11);
        bundle2.putParcelable(z11 ? COMMIT_CONTENT_OPTS_INTEROP_KEY : COMMIT_CONTENT_OPTS_KEY, bundle);
        return inputConnection.performPrivateCommand(z11 ? COMMIT_CONTENT_INTEROP_ACTION : COMMIT_CONTENT_ACTION, bundle2);
    }

    @NonNull
    private static OnCommitContentListener createOnCommitContentListenerUsingPerformReceiveContent(@NonNull final View view) {
        Preconditions.checkNotNull(view);
        return new OnCommitContentListener() { // from class: androidx.core.view.inputmethod.d
            @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
            public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i11, Bundle bundle) {
                return InputConnectionCompat.a(view, inputContentInfoCompat, i11, bundle);
            }
        };
    }

    @NonNull
    @Deprecated
    public static InputConnection createWrapper(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull final OnCommitContentListener onCommitContentListener) {
        ObjectsCompat.requireNonNull(inputConnection, "inputConnection must be non-null");
        ObjectsCompat.requireNonNull(editorInfo, "editorInfo must be non-null");
        ObjectsCompat.requireNonNull(onCommitContentListener, "onCommitContentListener must be non-null");
        boolean z11 = false;
        return Build.VERSION.SDK_INT >= 25 ? new InputConnectionWrapper(inputConnection, z11) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
                if (onCommitContentListener.onCommitContent(InputContentInfoCompat.wrap(inputContentInfo), i11, bundle)) {
                    return true;
                }
                return super.commitContent(inputContentInfo, i11, bundle);
            }
        } : EditorInfoCompat.getContentMimeTypes(editorInfo).length == 0 ? inputConnection : new InputConnectionWrapper(inputConnection, z11) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.2
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean performPrivateCommand(String str, Bundle bundle) {
                if (InputConnectionCompat.handlePerformPrivateCommand(str, bundle, onCommitContentListener)) {
                    return true;
                }
                return super.performPrivateCommand(str, bundle);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static boolean handlePerformPrivateCommand(@Nullable String str, @Nullable Bundle bundle, @NonNull OnCommitContentListener onCommitContentListener) {
        boolean z11;
        ResultReceiver resultReceiver;
        ?? r02 = 0;
        r02 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(COMMIT_CONTENT_ACTION, str)) {
            z11 = false;
        } else {
            if (!TextUtils.equals(COMMIT_CONTENT_INTEROP_ACTION, str)) {
                return false;
            }
            z11 = true;
        }
        try {
            ResultReceiver resultReceiver2 = (ResultReceiver) bundle.getParcelable(z11 ? COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY : COMMIT_CONTENT_RESULT_RECEIVER_KEY);
            try {
                Uri uri = (Uri) bundle.getParcelable(z11 ? COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY : COMMIT_CONTENT_CONTENT_URI_KEY);
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z11 ? COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY : COMMIT_CONTENT_DESCRIPTION_KEY);
                Uri uri2 = (Uri) bundle.getParcelable(z11 ? COMMIT_CONTENT_LINK_URI_INTEROP_KEY : COMMIT_CONTENT_LINK_URI_KEY);
                int i11 = bundle.getInt(z11 ? COMMIT_CONTENT_FLAGS_INTEROP_KEY : COMMIT_CONTENT_FLAGS_KEY);
                Bundle bundle2 = (Bundle) bundle.getParcelable(z11 ? COMMIT_CONTENT_OPTS_INTEROP_KEY : COMMIT_CONTENT_OPTS_KEY);
                if (uri != null && clipDescription != null) {
                    r02 = onCommitContentListener.onCommitContent(new InputContentInfoCompat(uri, clipDescription, uri2), i11, bundle2);
                }
                if (resultReceiver2 != 0) {
                    resultReceiver2.send(r02, null);
                }
                return r02;
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = resultReceiver2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            resultReceiver = null;
        }
    }

    @NonNull
    public static InputConnection createWrapper(@NonNull View view, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return createWrapper(inputConnection, editorInfo, createOnCommitContentListenerUsingPerformReceiveContent(view));
    }
}
