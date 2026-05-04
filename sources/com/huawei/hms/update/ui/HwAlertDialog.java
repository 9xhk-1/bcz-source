package com.huawei.hms.update.ui;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Space;
import android.widget.TextView;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.ButtonConfig;
import com.huawei.hms.update.ui.HwAlertController;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HwAlertDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    final HwAlertController f36611a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f36612b;

    /* renamed from: c, reason: collision with root package name */
    private int f36613c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final HwAlertController.AlertParams f36614a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36615b;

        /* renamed from: c, reason: collision with root package name */
        private int f36616c;

        public Builder(Context context) {
            this(context, HwAlertDialog.a(context, ResourceLoaderUtil.getStyleId("HwCloudAlertDialog")));
        }

        public HwAlertDialog create() {
            HwAlertDialog hwAlertDialog = new HwAlertDialog(this.f36614a.mCtx, this.f36615b, this.f36616c);
            this.f36614a.apply(hwAlertDialog.f36611a);
            hwAlertDialog.setCancelable(this.f36614a.mCancelable);
            if (this.f36614a.mCancelable) {
                hwAlertDialog.setCanceledOnTouchOutside(true);
            }
            hwAlertDialog.setOnCancelListener(this.f36614a.mOnCancelListener);
            hwAlertDialog.setOnDismissListener(this.f36614a.mOnDismListener);
            DialogInterface.OnKeyListener onKeyListener = this.f36614a.mOnKeyListener;
            if (onKeyListener != null) {
                hwAlertDialog.setOnKeyListener(onKeyListener);
            }
            return hwAlertDialog;
        }

        public Context getContext() {
            return this.f36614a.mCtx;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mListAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setButtonBgColor(int i11, int i12, int i13) {
            ButtonConfig buttonConfig = this.f36614a.btnConfigs.get(Integer.valueOf(i11));
            if (buttonConfig != null) {
                buttonConfig.f36537a = i12;
                buttonConfig.f36538b = i13;
            }
            return this;
        }

        public Builder setButtonLevel(int i11, ButtonConfig.Level level) {
            ButtonConfig buttonConfig = this.f36614a.btnConfigs.get(Integer.valueOf(i11));
            if (buttonConfig != null) {
                buttonConfig.f36542f = level;
                buttonConfig.f36538b = HwDialogUtil.a(getContext(), level);
                buttonConfig.f36537a = HwDialogUtil.c(getContext(), level);
                buttonConfig.f36540d = HwDialogUtil.b(getContext(), level);
                buttonConfig.f36539c = HwDialogUtil.d(getContext(), level);
            }
            return this;
        }

        public Builder setButtonTextColor(int i11, int i12, int i13) {
            ButtonConfig buttonConfig = this.f36614a.btnConfigs.get(Integer.valueOf(i11));
            if (buttonConfig != null) {
                buttonConfig.f36539c = i12;
                buttonConfig.f36540d = i13;
            }
            return this;
        }

        public Builder setButtonTextSize(int i11) {
            Set<Integer> keySet = this.f36614a.btnConfigs.keySet();
            if (keySet != null) {
                Iterator<Integer> it = keySet.iterator();
                while (it.hasNext()) {
                    this.f36614a.btnConfigs.get(it.next()).f36541e = i11;
                }
            }
            return this;
        }

        public Builder setCancelable(boolean z11) {
            this.f36614a.mCancelable = z11;
            return this;
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mCursor = cursor;
            alertParams.mLabelColumn = str;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setCustomTitle(View view) {
            this.f36614a.mCtmTitleView = view;
            return this;
        }

        public Builder setDialogBackground(int i11) {
            this.f36616c = i11;
            return this;
        }

        public Builder setIcon(int i11) {
            this.f36614a.mIcId = i11;
            return this;
        }

        public Builder setIconAttribute(int i11) {
            TypedValue typedValue = new TypedValue();
            this.f36614a.mCtx.getTheme().resolveAttribute(i11, typedValue, true);
            this.f36614a.mIcId = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public Builder setInverseBackgroundForced(boolean z11) {
            this.f36614a.mForceInverseBg = z11;
            return this;
        }

        public Builder setItems(int i11, DialogInterface.OnClickListener onClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mItemArray = alertParams.mCtx.getResources().getTextArray(i11);
            this.f36614a.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setMessage(int i11) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mMsg = alertParams.mCtx.getText(i11);
            return this;
        }

        public Builder setMultiChoiceItems(int i11, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mItemArray = alertParams.mCtx.getResources().getTextArray(i11);
            HwAlertController.AlertParams alertParams2 = this.f36614a;
            alertParams2.mOnCkbClickListener = onMultiChoiceClickListener;
            alertParams2.mChkItems = zArr;
            alertParams2.mIsMultiChoice = true;
            return this;
        }

        public Builder setNegativeButton(int i11, DialogInterface.OnClickListener onClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mNegativeBtnText = alertParams.mCtx.getText(i11);
            this.f36614a.mNegativeBtnListener = onClickListener;
            return this;
        }

        public Builder setNegativeButtonIcon(Drawable drawable) {
            this.f36614a.mNegativeBtnIcon = drawable;
            return this;
        }

        public Builder setNeutralButton(int i11, DialogInterface.OnClickListener onClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mNeutralBtnText = alertParams.mCtx.getText(i11);
            this.f36614a.mNeutralBtnListener = onClickListener;
            return this;
        }

        public Builder setNeutralButtonIcon(Drawable drawable) {
            this.f36614a.mNeutralBtnIcon = drawable;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f36614a.mOnCancelListener = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f36614a.mOnDismListener = onDismissListener;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f36614a.mOnItemSleListener = onItemSelectedListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f36614a.mOnKeyListener = onKeyListener;
            return this;
        }

        public Builder setPositiveButton(int i11, DialogInterface.OnClickListener onClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mPositiveBtnText = alertParams.mCtx.getText(i11);
            this.f36614a.mPositiveBtnListener = onClickListener;
            return this;
        }

        public Builder setPositiveButtonIcon(Drawable drawable) {
            this.f36614a.mPositiveBtnIcon = drawable;
            return this;
        }

        public Builder setRecycleOnMeasureEnabled(boolean z11) {
            this.f36614a.mRecycleOnMeasure = z11;
            return this;
        }

        public Builder setSingleChoiceItems(int i11, int i12, DialogInterface.OnClickListener onClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mItemArray = alertParams.mCtx.getResources().getTextArray(i11);
            HwAlertController.AlertParams alertParams2 = this.f36614a;
            alertParams2.mOnClickListener = onClickListener;
            alertParams2.mChkItem = i12;
            alertParams2.mIsSingleChoice = true;
            return this;
        }

        public Builder setSubTitle(int i11) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mSubTitle = alertParams.mCtx.getText(i11);
            return this;
        }

        public Builder setTitle(int i11) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mTitle = alertParams.mCtx.getText(i11);
            return this;
        }

        public Builder setView(int i11) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mView = null;
            alertParams.mViewLayoutResId = i11;
            alertParams.mViewSpcSpecified = false;
            return this;
        }

        public HwAlertDialog show() {
            HwAlertDialog create = create();
            create.show();
            return create;
        }

        public Builder(Context context, int i11) {
            this.f36616c = -1;
            this.f36614a = new HwAlertController.AlertParams(new ContextThemeWrapper(context, HwAlertDialog.a(context, i11)));
            this.f36615b = i11;
        }

        public Builder setIcon(Drawable drawable) {
            this.f36614a.mIc = drawable;
            return this;
        }

        public Builder setMessage(CharSequence charSequence) {
            this.f36614a.mMsg = charSequence;
            return this;
        }

        public Builder setSubTitle(CharSequence charSequence) {
            this.f36614a.mSubTitle = charSequence;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.f36614a.mTitle = charSequence;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mItemArray = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mNegativeBtnText = charSequence;
            alertParams.mNegativeBtnListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mNeutralBtnText = charSequence;
            alertParams.mNeutralBtnListener = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mPositiveBtnText = charSequence;
            alertParams.mPositiveBtnListener = onClickListener;
            return this;
        }

        public Builder setButtonBgColor(int i11, int i12) {
            return setButtonBgColor(i11, i12, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_normal"));
        }

        public Builder setButtonTextColor(int i11, int i12) {
            return setButtonTextColor(i11, i12, ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_text_color"));
        }

        public Builder setView(View view) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            alertParams.mViewSpcSpecified = false;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mItemArray = charSequenceArr;
            alertParams.mOnCkbClickListener = onMultiChoiceClickListener;
            alertParams.mChkItems = zArr;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i11, String str, DialogInterface.OnClickListener onClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mCursor = cursor;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mChkItem = i11;
            alertParams.mLabelColumn = str;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        @Deprecated
        public Builder setView(View view, int i11, int i12, int i13, int i14) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            alertParams.mViewSpcSpecified = true;
            alertParams.mViewSpcLeft = i11;
            alertParams.mViewSpcTop = i12;
            alertParams.mViewSpcRight = i13;
            alertParams.mViewSpcBottom = i14;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mCursor = cursor;
            alertParams.mOnCkbClickListener = onMultiChoiceClickListener;
            alertParams.mIsChkColumn = str;
            alertParams.mLabelColumn = str2;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i11, DialogInterface.OnClickListener onClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mItemArray = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mChkItem = i11;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i11, DialogInterface.OnClickListener onClickListener) {
            HwAlertController.AlertParams alertParams = this.f36614a;
            alertParams.mListAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mChkItem = i11;
            alertParams.mIsSingleChoice = true;
            return this;
        }
    }

    public HwAlertDialog(Context context) {
        this(context, ResourceLoaderUtil.getStyleId("HwCloudAlertDialog"));
    }

    public static int a(Context context, int i11) {
        if (((i11 >>> 24) & 255) >= 1) {
            return i11;
        }
        if (context == null) {
            HMSLog.w("HwAlertDialog", "ctx is null");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    private boolean b() {
        return getContext() != null && (getContext().getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private void c() {
        if (this.f36611a == null) {
            return;
        }
        ArrayList<Button> arrayList = new ArrayList<>();
        LinkedHashMap<Button, Integer> linkedHashMap = new LinkedHashMap<>();
        a(arrayList, linkedHashMap);
        if (arrayList.size() == 0) {
            return;
        }
        int i11 = getWindow().getAttributes().width;
        int a11 = HwDialogUtil.a(getContext(), 16.0f) * 2;
        int a12 = HwDialogUtil.a(getContext(), 12.0f) * 2;
        int a13 = HwDialogUtil.a(getContext(), 8.0f) * 2;
        int a14 = HwDialogUtil.a(getContext(), 32.0f) * arrayList.size();
        int a15 = HwDialogUtil.a(getContext(), 8.0f) * arrayList.size();
        int i12 = (i11 - a11) - a12;
        int a16 = ((((i12 - a13) - a14) - a15) - (HwDialogUtil.a(getContext(), 1.0f) * (arrayList.size() - 1))) / arrayList.size();
        this.f36613c = (int) arrayList.get(0).getTextSize();
        Iterator<Button> it = arrayList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Button next = it.next();
            if (i13 == 1) {
                break;
            }
            int a17 = a(next, a16);
            if (a17 == 1) {
                i13 = a17;
            }
        }
        ViewParent parent = arrayList.get(0).getParent();
        boolean z11 = parent instanceof LinearLayout;
        if (z11 && i13 == 1) {
            ((LinearLayout) parent).setOrientation(1);
            a(arrayList, (i12 - a14) - a15);
        }
        if (!z11 || arrayList.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) parent;
        linearLayout.removeAllViews();
        int i14 = 0;
        while (i14 < arrayList.size()) {
            Button button = arrayList.get(i14);
            linearLayout.addView(button);
            LinearLayout linearLayout2 = linearLayout;
            a(arrayList, linkedHashMap, linearLayout2, i14, button);
            if (i14 == arrayList.size() - 1 && linearLayout2.getOrientation() == 1 && arrayList.size() > 1) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
                layoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_button_vertical_divider_bottom_height"));
                button.setLayoutParams(layoutParams);
            }
            i14++;
            linearLayout = linearLayout2;
        }
    }

    private void d() {
        TextView textView;
        HwAlertController hwAlertController = this.f36611a;
        if (hwAlertController == null || (textView = hwAlertController.J) == null) {
            return;
        }
        textView.setTextColor(getContext().getResources().getColor(ResourceLoaderUtil.getColorId("hw_cloud_dialog_msg")));
        this.f36611a.J.setTextSize(0, getContext().getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_msg_text_size")));
    }

    private void e() {
        TextView textView;
        TextView textView2;
        HwAlertController hwAlertController = this.f36611a;
        if (hwAlertController != null && (textView2 = hwAlertController.H) != null) {
            textView2.setTextColor(getContext().getResources().getColor(ResourceLoaderUtil.getColorId("hw_cloud_dialog_title_text_color")));
            this.f36611a.H.setTextSize(0, getContext().getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_title_text_size")));
        }
        HwAlertController hwAlertController2 = this.f36611a;
        if (hwAlertController2 == null || (textView = hwAlertController2.I) == null) {
            return;
        }
        textView.setTextColor(getContext().getResources().getColor(ResourceLoaderUtil.getColorId("hw_cloud_dialog_subtitle_text_color")));
        this.f36611a.I.setTextSize(0, getContext().getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_subtitle_text_size")));
    }

    public Activity getActivityFromContext(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof Application) && !(context instanceof Service)) {
            while (context != null && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
        }
        return null;
    }

    public Button getButton(int i11) {
        return this.f36611a.getButton(i11);
    }

    public ListView getListView() {
        return this.f36611a.getListView();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f36611a.installContent();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (this.f36611a.onKeyDown(i11, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (this.f36611a.onKeyUp(i11, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    public void setButton(int i11, CharSequence charSequence, Message message) {
        this.f36611a.setButton(i11, charSequence, null, message, null);
    }

    public void setCustomTitle(View view) {
        this.f36611a.setCustomTitle(view);
    }

    public void setEmuiStyle() {
        e();
        d();
        c();
    }

    public void setIcon(int i11) {
        this.f36611a.setIcon(i11);
    }

    public void setIconAttribute(int i11) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i11, typedValue, true);
        this.f36611a.setIcon(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        this.f36611a.setMessage(charSequence);
    }

    public void setSubTitle(CharSequence charSequence) {
        this.f36611a.setSubTitle(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f36611a.setTitle(charSequence);
    }

    public void setView(View view) {
        this.f36611a.setView(view);
    }

    public void setWindowStyle(Window window) {
        float f11;
        if (window == null) {
            return;
        }
        window.setDimAmount(0.2f);
        window.setBackgroundDrawableResource(R.color.transparent);
        window.getDecorView().setBackgroundResource(R.color.transparent);
        window.setWindowAnimations(ResourceLoaderUtil.getStyleId("HwCloudDialogWindowAnim"));
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i11 = getContext().getResources().getConfiguration().orientation;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int i12 = displayMetrics.widthPixels;
        float max = Math.max(i12, displayMetrics.heightPixels);
        if (max != 0.0f) {
            f11 = Math.min(i12, r2) / max;
        } else {
            HMSLog.e("HwAlertDialog", "maxPixels is 0.");
            f11 = 1.0f;
        }
        HMSLog.i("HwAlertDialog", "scale = " + f11);
        if (i11 == 2) {
            attributes.width = (int) (i12 * 0.5d);
            window.setGravity(17);
            HMSLog.i("HwAlertDialog", "ORIENTATION_LANDSCAPE");
        } else {
            attributes.width = i12;
            window.setGravity(80);
            HMSLog.i("HwAlertDialog", "ORIENTATION_PORTRAIT");
        }
        if (b()) {
            if (f11 > 0.8d) {
                if (i11 == 2) {
                    attributes.width = (int) (i12 * 0.63f);
                } else {
                    attributes.width = (int) (i12 * 0.63f);
                }
            } else if (i11 == 2) {
                attributes.width = (int) (i12 * 0.42f);
            } else {
                attributes.width = (int) (i12 * 0.63f);
            }
            window.setGravity(17);
            HMSLog.i("HwAlertDialog", "IS_LARGE_SCREEN");
        }
        Activity activityFromContext = getActivityFromContext(getContext());
        if (activityFromContext != null && activityFromContext.isInMultiWindowMode()) {
            attributes.width = i12;
            window.setGravity(17);
            HMSLog.i("HwAlertDialog", "IS_MULTI_WINDOW_MODE");
        }
        attributes.height = -2;
        window.setAttributes(attributes);
        window.clearFlags(131080);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        setWindowStyle(getWindow());
        setEmuiStyle();
    }

    public HwAlertDialog(Context context, int i11) {
        super(context, a(context, i11));
        this.f36612b = new TextPaint();
        this.f36611a = new HwAlertController(getContext(), this, getWindow());
    }

    public void setButton(int i11, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f36611a.setButton(i11, charSequence, onClickListener, null, null);
    }

    public void setIcon(Drawable drawable) {
        this.f36611a.setIcon(drawable);
    }

    public void setView(View view, int i11, int i12, int i13, int i14) {
        this.f36611a.setView(view, i11, i12, i13, i14);
    }

    public void setButton(int i11, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f36611a.setButton(i11, charSequence, onClickListener, null, drawable);
    }

    public HwAlertDialog(Context context, int i11, int i12) {
        super(context, a(context, i11));
        this.f36612b = new TextPaint();
        this.f36611a = new HwAlertController(getContext(), this, getWindow());
    }

    private void a(ArrayList<Button> arrayList, LinkedHashMap<Button, Integer> linkedHashMap, LinearLayout linearLayout, int i11, Button button) {
        boolean z11 = false;
        if (linearLayout.getOrientation() == 0) {
            ButtonConfig buttonConfig = this.f36611a.f36574q.get(linkedHashMap.get(button));
            if (buttonConfig == null) {
                buttonConfig = ButtonConfig.createDefault(getContext());
                this.f36611a.f36574q.put(linkedHashMap.get(button), buttonConfig);
            }
            ButtonConfig.Level level = buttonConfig.f36542f;
            ButtonConfig.Level level2 = ButtonConfig.Level.NORMAL;
            boolean z12 = level != level2;
            int i12 = i11 + 1;
            if (i12 < arrayList.size()) {
                Button button2 = arrayList.get(i12);
                ButtonConfig buttonConfig2 = this.f36611a.f36574q.get(linkedHashMap.get(button2));
                if (buttonConfig2 == null) {
                    buttonConfig2 = ButtonConfig.createDefault(getContext());
                    this.f36611a.f36574q.put(linkedHashMap.get(button2), buttonConfig2);
                }
                if (z12 || buttonConfig2.f36542f != level2) {
                    z11 = true;
                }
            } else {
                z11 = z12;
            }
        }
        if (arrayList.size() <= 1 || i11 >= arrayList.size() - 1) {
            return;
        }
        if (!z11) {
            linearLayout.addView(a(linearLayout.getOrientation()));
        } else {
            linearLayout.addView(a());
        }
    }

    public HwAlertDialog(Context context, boolean z11, DialogInterface.OnCancelListener onCancelListener) {
        this(context, ResourceLoaderUtil.getStyleId("HwCloudAlertDialog"));
        setCancelable(z11);
        setOnCancelListener(onCancelListener);
    }

    private void a(ArrayList<Button> arrayList, int i11) {
        if (arrayList.size() > 2) {
            Collections.reverse(arrayList);
        }
        Iterator<Button> it = arrayList.iterator();
        while (it.hasNext()) {
            TextView textView = (Button) it.next();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.weight = 1.0f;
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = 0;
            textView.setLayoutParams(layoutParams);
            a(textView, i11, 1);
        }
        Iterator<Button> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().setTextSize(0, this.f36613c);
        }
    }

    private void a(ArrayList<Button> arrayList, LinkedHashMap<Button, Integer> linkedHashMap) {
        if (!TextUtils.isEmpty(this.f36611a.f36580w)) {
            Button button = this.f36611a.f36579v;
            button.setText(button.getText().toString().toUpperCase(Locale.ROOT));
            arrayList.add(this.f36611a.f36579v);
            linkedHashMap.put(this.f36611a.f36579v, -3);
        }
        if (!TextUtils.isEmpty(this.f36611a.A)) {
            Button button2 = this.f36611a.f36583z;
            button2.setText(button2.getText().toString().toUpperCase(Locale.ROOT));
            arrayList.add(this.f36611a.f36583z);
            linkedHashMap.put(this.f36611a.f36583z, -2);
        }
        if (TextUtils.isEmpty(this.f36611a.f36576s)) {
            return;
        }
        Button button3 = this.f36611a.f36575r;
        button3.setText(button3.getText().toString().toUpperCase(Locale.ROOT));
        arrayList.add(this.f36611a.f36575r);
        linkedHashMap.put(this.f36611a.f36575r, -1);
    }

    private int a(TextView textView, int i11) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.weight = 1.0f;
        layoutParams.width = 0;
        layoutParams.height = HwDialogUtil.a(getContext(), 40.0f);
        textView.setLayoutParams(layoutParams);
        String charSequence = textView.getText().toString();
        this.f36612b.setTextSize((int) textView.getTextSize());
        return ((float) i11) > this.f36612b.measureText(charSequence) ? 0 : 1;
    }

    private boolean a(TextView textView, int i11, int i12) {
        boolean z11;
        int textSize = (int) textView.getTextSize();
        String charSequence = textView.getText().toString();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_min_button_text_size"));
        this.f36612b.setTextSize(textSize);
        float measureText = this.f36612b.measureText(charSequence);
        while (true) {
            if (i11 >= measureText) {
                z11 = true;
                break;
            }
            if (textSize < dimensionPixelSize) {
                z11 = false;
                break;
            }
            textSize--;
            this.f36612b.setTextSize(textSize);
            measureText = this.f36612b.measureText(charSequence);
        }
        if (z11 || i12 == 1) {
            textView.setTextSize(0, textSize);
            if (((int) textView.getTextSize()) < this.f36613c) {
                this.f36613c = (int) textView.getTextSize();
            }
        }
        return z11;
    }

    private View a(int i11) {
        View view = new View(getContext());
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_button_divider_width"));
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_button_divider_height"));
        if (i11 == 1) {
            dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_button_vertical_divider_height"));
            dimensionPixelSize = -1;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2);
        layoutParams.gravity = 16;
        int dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_button_margin"));
        layoutParams.setMarginStart(dimensionPixelSize3);
        layoutParams.setMarginEnd(dimensionPixelSize3);
        view.setLayoutParams(layoutParams);
        if (i11 == 0) {
            view.setBackgroundResource(ResourceLoaderUtil.getColorId("hw_cloud_dialog_list_divider"));
        }
        return view;
    }

    private Space a() {
        Space space = new Space(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getContext().getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_button_horizontal_divider_strong_width")), getContext().getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_button_space_min")));
        layoutParams.gravity = 16;
        space.setLayoutParams(layoutParams);
        return space;
    }
}
