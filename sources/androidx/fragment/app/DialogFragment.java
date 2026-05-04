package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;

    @Nullable
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private Observer<LifecycleOwner> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public DialogFragment() {
        this.mDismissRunnable = new Runnable() { // from class: androidx.fragment.app.DialogFragment.1
            @Override // java.lang.Runnable
            public void run() {
                DialogFragment.this.mOnDismissListener.onDismiss(DialogFragment.this.mDialog);
            }
        };
        this.mOnCancelListener = new DialogInterface.OnCancelListener() { // from class: androidx.fragment.app.DialogFragment.2
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(@Nullable DialogInterface dialogInterface) {
                if (DialogFragment.this.mDialog != null) {
                    DialogFragment dialogFragment = DialogFragment.this;
                    dialogFragment.onCancel(dialogFragment.mDialog);
                }
            }
        };
        this.mOnDismissListener = new DialogInterface.OnDismissListener() { // from class: androidx.fragment.app.DialogFragment.3
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(@Nullable DialogInterface dialogInterface) {
                if (DialogFragment.this.mDialog != null) {
                    DialogFragment dialogFragment = DialogFragment.this;
                    dialogFragment.onDismiss(dialogFragment.mDialog);
                }
            }
        };
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new Observer<LifecycleOwner>() { // from class: androidx.fragment.app.DialogFragment.4
            @Override // androidx.lifecycle.Observer
            public void onChanged(LifecycleOwner lifecycleOwner) {
                if (lifecycleOwner == null || !DialogFragment.this.mShowsDialog) {
                    return;
                }
                View requireView = DialogFragment.this.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (DialogFragment.this.mDialog != null) {
                    if (FragmentManager.isLoggingEnabled(3)) {
                        Log.d(FragmentManager.TAG, "DialogFragment " + this + " setting the content view on " + DialogFragment.this.mDialog);
                    }
                    DialogFragment.this.mDialog.setContentView(requireView);
                }
            }
        };
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z11, boolean z12, boolean z13) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z12) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z13) {
                getParentFragmentManager().popBackStackImmediate(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().popBackStack(this.mBackStackId, 1, z11);
            }
            this.mBackStackId = -1;
            return;
        }
        FragmentTransaction beginTransaction = getParentFragmentManager().beginTransaction();
        beginTransaction.setReorderingAllowed(true);
        beginTransaction.remove(this);
        if (z13) {
            beginTransaction.commitNow();
        } else if (z11) {
            beginTransaction.commitAllowingStateLoss();
        } else {
            beginTransaction.commit();
        }
    }

    private void prepareDialog(@Nullable Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(onCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
                this.mCreatingDialog = false;
            } catch (Throwable th2) {
                this.mCreatingDialog = false;
                throw th2;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public FragmentContainer createFragmentContainer() {
        final FragmentContainer createFragmentContainer = super.createFragmentContainer();
        return new FragmentContainer() { // from class: androidx.fragment.app.DialogFragment.5
            @Override // androidx.fragment.app.FragmentContainer
            @Nullable
            public View onFindViewById(int i11) {
                return createFragmentContainer.onHasView() ? createFragmentContainer.onFindViewById(i11) : DialogFragment.this.onFindViewById(i11);
            }

            @Override // androidx.fragment.app.FragmentContainer
            public boolean onHasView() {
                return createFragmentContainer.onHasView() || DialogFragment.this.onHasView();
            }
        };
    }

    public void dismiss() {
        dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false, false);
    }

    @MainThread
    public void dismissNow() {
        dismissInternal(false, false, true);
    }

    @Nullable
    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @StyleRes
    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @NonNull
    @MainThread
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "onCreateDialog called for DialogFragment " + this);
        }
        return new ComponentDialog(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    @CallSuper
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "onDismiss called for DialogFragment " + this);
        }
        dismissInternal(true, true, false);
    }

    @Nullable
    public View onFindViewById(int i11) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i11);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.d(FragmentManager.TAG, "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.isLoggingEnabled(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.mShowsDialog) {
                Log.d(FragmentManager.TAG, "mShowsDialog = false: " + str);
                return onGetLayoutInflater;
            }
            Log.d(FragmentManager.TAG, "mCreatingDialog = true: " + str);
        }
        return onGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i11 = this.mStyle;
        if (i11 != 0) {
            bundle.putInt(SAVED_STYLE, i11);
        }
        int i12 = this.mTheme;
        if (i12 != 0) {
            bundle.putInt(SAVED_THEME, i12);
        }
        boolean z11 = this.mCancelable;
        if (!z11) {
            bundle.putBoolean(SAVED_CANCELABLE, z11);
        }
        boolean z12 = this.mShowsDialog;
        if (!z12) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z12);
        }
        int i13 = this.mBackStackId;
        if (i13 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i13);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            ViewTreeSavedStateRegistryOwner.set(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @MainThread
    public void onViewStateRestored(@Nullable Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @NonNull
    public final ComponentDialog requireComponentDialog() {
        Dialog requireDialog = requireDialog();
        if (requireDialog instanceof ComponentDialog) {
            return (ComponentDialog) requireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + requireDialog);
    }

    @NonNull
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z11) {
        this.mCancelable = z11;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z11);
        }
    }

    public void setShowsDialog(boolean z11) {
        this.mShowsDialog = z11;
    }

    public void setStyle(int i11, @StyleRes int i12) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.d(FragmentManager.TAG, "Setting style and theme for DialogFragment " + this + " to " + i11 + j2.O + i12);
        }
        this.mStyle = i11;
        if (i11 == 2 || i11 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i12 != 0) {
            this.mTheme = i12;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@NonNull Dialog dialog, int i11) {
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.setReorderingAllowed(true);
        beginTransaction.add(this, str);
        beginTransaction.commit();
    }

    public void showNow(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.setReorderingAllowed(true);
        beginTransaction.add(this, str);
        beginTransaction.commitNow();
    }

    public int show(@NonNull FragmentTransaction fragmentTransaction, @Nullable String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        fragmentTransaction.add(this, str);
        this.mViewDestroyed = false;
        int commit = fragmentTransaction.commit();
        this.mBackStackId = commit;
        return commit;
    }

    public DialogFragment(@LayoutRes int i11) {
        super(i11);
        this.mDismissRunnable = new Runnable() { // from class: androidx.fragment.app.DialogFragment.1
            @Override // java.lang.Runnable
            public void run() {
                DialogFragment.this.mOnDismissListener.onDismiss(DialogFragment.this.mDialog);
            }
        };
        this.mOnCancelListener = new DialogInterface.OnCancelListener() { // from class: androidx.fragment.app.DialogFragment.2
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(@Nullable DialogInterface dialogInterface) {
                if (DialogFragment.this.mDialog != null) {
                    DialogFragment dialogFragment = DialogFragment.this;
                    dialogFragment.onCancel(dialogFragment.mDialog);
                }
            }
        };
        this.mOnDismissListener = new DialogInterface.OnDismissListener() { // from class: androidx.fragment.app.DialogFragment.3
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(@Nullable DialogInterface dialogInterface) {
                if (DialogFragment.this.mDialog != null) {
                    DialogFragment dialogFragment = DialogFragment.this;
                    dialogFragment.onDismiss(dialogFragment.mDialog);
                }
            }
        };
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new Observer<LifecycleOwner>() { // from class: androidx.fragment.app.DialogFragment.4
            @Override // androidx.lifecycle.Observer
            public void onChanged(LifecycleOwner lifecycleOwner) {
                if (lifecycleOwner == null || !DialogFragment.this.mShowsDialog) {
                    return;
                }
                View requireView = DialogFragment.this.requireView();
                if (requireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (DialogFragment.this.mDialog != null) {
                    if (FragmentManager.isLoggingEnabled(3)) {
                        Log.d(FragmentManager.TAG, "DialogFragment " + this + " setting the content view on " + DialogFragment.this.mDialog);
                    }
                    DialogFragment.this.mDialog.setContentView(requireView);
                }
            }
        };
        this.mDialogCreated = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
    }
}
