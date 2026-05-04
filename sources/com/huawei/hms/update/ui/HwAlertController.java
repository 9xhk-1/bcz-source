package com.huawei.hms.update.ui;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.ButtonConfig;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HwAlertController {
    CharSequence A;
    Message B;
    Drawable C;
    ScrollView D;
    Drawable F;
    ImageView G;
    TextView H;
    TextView I;
    TextView J;
    View K;
    ListAdapter L;

    /* renamed from: a, reason: collision with root package name */
    Handler f36558a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36559b;

    /* renamed from: c, reason: collision with root package name */
    final Dialog f36560c;

    /* renamed from: d, reason: collision with root package name */
    final Window f36561d;

    /* renamed from: f, reason: collision with root package name */
    CharSequence f36563f;

    /* renamed from: g, reason: collision with root package name */
    CharSequence f36564g;

    /* renamed from: h, reason: collision with root package name */
    CharSequence f36565h;

    /* renamed from: i, reason: collision with root package name */
    View f36566i;

    /* renamed from: j, reason: collision with root package name */
    ListView f36567j;

    /* renamed from: k, reason: collision with root package name */
    int f36568k;

    /* renamed from: m, reason: collision with root package name */
    int f36570m;

    /* renamed from: n, reason: collision with root package name */
    int f36571n;

    /* renamed from: o, reason: collision with root package name */
    int f36572o;

    /* renamed from: p, reason: collision with root package name */
    int f36573p;

    /* renamed from: r, reason: collision with root package name */
    Button f36575r;

    /* renamed from: s, reason: collision with root package name */
    CharSequence f36576s;

    /* renamed from: t, reason: collision with root package name */
    Message f36577t;

    /* renamed from: u, reason: collision with root package name */
    Drawable f36578u;

    /* renamed from: v, reason: collision with root package name */
    Button f36579v;

    /* renamed from: w, reason: collision with root package name */
    CharSequence f36580w;

    /* renamed from: x, reason: collision with root package name */
    Message f36581x;

    /* renamed from: y, reason: collision with root package name */
    Drawable f36582y;

    /* renamed from: z, reason: collision with root package name */
    Button f36583z;

    /* renamed from: l, reason: collision with root package name */
    boolean f36569l = false;

    /* renamed from: q, reason: collision with root package name */
    HashMap<Integer, ButtonConfig> f36574q = new HashMap<>();
    int E = 0;
    int M = -1;
    private int S = 0;
    private final View.OnClickListener T = new View.OnClickListener() { // from class: com.huawei.hms.update.ui.HwAlertController.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            HwAlertController hwAlertController = HwAlertController.this;
            Message obtain = (view != hwAlertController.f36575r || (message3 = hwAlertController.f36577t) == null) ? (view != hwAlertController.f36583z || (message2 = hwAlertController.B) == null) ? (view != hwAlertController.f36579v || (message = hwAlertController.f36581x) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            HwAlertController hwAlertController2 = HwAlertController.this;
            hwAlertController2.f36558a.obtainMessage(1, hwAlertController2.f36560c).sendToTarget();
        }
    };
    public int mAlertDialogLayout = ResourceLoaderUtil.getLayoutId("hw_cloud_alert_dialog_material");
    public int mBtnPanelSideLayout = ResourceLoaderUtil.getLayoutId("hw_cloud_alert_dialog_button_bar_material");
    int O = ResourceLoaderUtil.getLayoutId("hw_cloud_select_dialog_material");
    int R = ResourceLoaderUtil.getLayoutId("hw_cloud_select_dialog_multichoice_material");
    int Q = ResourceLoaderUtil.getLayoutId("hw_cloud_select_dialog_singlechoice_material");
    int P = ResourceLoaderUtil.getLayoutId("hw_cloud_select_dialog_item_material");
    private final boolean N = true;

    /* renamed from: e, reason: collision with root package name */
    final int f36562e = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.huawei.hms.update.ui.HwAlertController$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnScrollChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f36585a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f36586b;

        public AnonymousClass2(View view, View view2) {
            this.f36585a = view;
            this.f36586b = view2;
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i11, int i12, int i13, int i14) {
            HwAlertController.a(view, this.f36585a, this.f36586b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.huawei.hms.update.ui.HwAlertController$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f36588a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f36589b;

        public AnonymousClass3(View view, View view2) {
            this.f36588a = view;
            this.f36589b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            HwAlertController.a(HwAlertController.this.D, this.f36588a, this.f36589b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.huawei.hms.update.ui.HwAlertController$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f36591a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f36592b;

        public AnonymousClass4(View view, View view2) {
            this.f36591a = view;
            this.f36592b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            HwAlertController.a(HwAlertController.this.f36567j, this.f36591a, this.f36592b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AlertParams {
        public boolean[] mChkItems;
        public View mCtmTitleView;
        public final Context mCtx;
        public Cursor mCursor;
        public boolean mForceInverseBg;
        public Drawable mIc;
        public final LayoutInflater mInflater;
        public String mIsChkColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public CharSequence[] mItemArray;
        public String mLabelColumn;
        public ListAdapter mListAdapter;
        public CharSequence mMsg;
        public Drawable mNegativeBtnIcon;
        public DialogInterface.OnClickListener mNegativeBtnListener;
        public CharSequence mNegativeBtnText;
        public Drawable mNeutralBtnIcon;
        public DialogInterface.OnClickListener mNeutralBtnListener;
        public CharSequence mNeutralBtnText;
        public DialogInterface.OnCancelListener mOnCancelListener;
        public DialogInterface.OnMultiChoiceClickListener mOnCkbClickListener;
        public DialogInterface.OnClickListener mOnClickListener;
        public DialogInterface.OnDismissListener mOnDismListener;
        public AdapterView.OnItemSelectedListener mOnItemSleListener;
        public DialogInterface.OnKeyListener mOnKeyListener;
        public OnPrepareListViewListener mOnPrepareLvListener;
        public Drawable mPositiveBtnIcon;
        public DialogInterface.OnClickListener mPositiveBtnListener;
        public CharSequence mPositiveBtnText;
        public CharSequence mSubTitle;
        public CharSequence mTitle;
        public View mView;
        public int mViewLayoutResId;
        public int mViewSpcBottom;
        public int mViewSpcLeft;
        public int mViewSpcRight;
        public int mViewSpcTop;
        public int mIcId = 0;
        public int mIcAttrId = 0;
        public boolean mViewSpcSpecified = false;
        public int mChkItem = -1;
        public boolean mRecycleOnMeasure = true;
        public HashMap<Integer, ButtonConfig> btnConfigs = new HashMap<>();
        public boolean mCancelable = true;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface OnPrepareListViewListener {
            void onPrepareListView(ListView listView);
        }

        public AlertParams(Context context) {
            this.mCtx = context;
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            this.btnConfigs.put(-1, ButtonConfig.createDefault(context));
            this.btnConfigs.put(-2, ButtonConfig.createDefault(context));
            this.btnConfigs.put(-3, ButtonConfig.createDefault(context));
        }

        private void a(final HwAlertController hwAlertController) {
            final ListView listView;
            ListAdapter listAdapter;
            try {
                listView = (ListView) this.mInflater.inflate(hwAlertController.O, (ViewGroup) null);
            } catch (Exception e11) {
                HMSLog.e("HwAlertController", "<createListView> inflate listView Exception: " + e11.getMessage());
                listView = null;
            }
            if (listView == null) {
                return;
            }
            if (!this.mIsMultiChoice) {
                int i11 = this.mIsSingleChoice ? hwAlertController.Q : hwAlertController.P;
                if (this.mCursor != null) {
                    listAdapter = new SimpleCursorAdapter(this.mCtx, i11, this.mCursor, new String[]{this.mLabelColumn}, new int[]{R.id.text1});
                } else {
                    listAdapter = this.mListAdapter;
                    if (listAdapter == null) {
                        listAdapter = new b(this.mCtx, i11, R.id.text1, this.mItemArray);
                    }
                }
            } else if (this.mCursor == null) {
                final ListView listView2 = listView;
                listAdapter = new ArrayAdapter<CharSequence>(this.mCtx, hwAlertController.R, R.id.text1, this.mItemArray) { // from class: com.huawei.hms.update.ui.HwAlertController.AlertParams.1
                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public View getView(int i12, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i12, view, viewGroup);
                        boolean[] zArr = AlertParams.this.mChkItems;
                        if (zArr != null && zArr[i12]) {
                            listView2.setItemChecked(i12, true);
                        }
                        return view2;
                    }
                };
                listView = listView2;
            } else {
                listAdapter = new CursorAdapter(this.mCtx, this.mCursor, false) { // from class: com.huawei.hms.update.ui.HwAlertController.AlertParams.2

                    /* renamed from: a, reason: collision with root package name */
                    private final int f36596a;

                    /* renamed from: b, reason: collision with root package name */
                    private final int f36597b;

                    {
                        Cursor cursor = getCursor();
                        this.f36596a = cursor.getColumnIndexOrThrow(AlertParams.this.mLabelColumn);
                        this.f36597b = cursor.getColumnIndexOrThrow(AlertParams.this.mIsChkColumn);
                    }

                    @Override // android.widget.CursorAdapter
                    public void bindView(View view, Context context, Cursor cursor) {
                        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f36596a));
                        listView.setItemChecked(cursor.getPosition(), cursor.getInt(this.f36597b) == 1);
                    }

                    @Override // android.widget.CursorAdapter
                    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                        return AlertParams.this.mInflater.inflate(hwAlertController.R, viewGroup, false);
                    }
                };
            }
            OnPrepareListViewListener onPrepareListViewListener = this.mOnPrepareLvListener;
            if (onPrepareListViewListener != null) {
                onPrepareListViewListener.onPrepareListView(listView);
            }
            hwAlertController.L = listAdapter;
            hwAlertController.M = this.mChkItem;
            if (this.mOnClickListener != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.hms.update.ui.HwAlertController.AlertParams.3
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i12, long j11) {
                        AlertParams.this.mOnClickListener.onClick(hwAlertController.f36560c, i12);
                        if (AlertParams.this.mIsSingleChoice) {
                            return;
                        }
                        hwAlertController.f36560c.dismiss();
                    }
                });
            } else if (this.mOnCkbClickListener != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.hms.update.ui.HwAlertController.AlertParams.4
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i12, long j11) {
                        boolean[] zArr = AlertParams.this.mChkItems;
                        if (zArr != null) {
                            zArr[i12] = listView.isItemChecked(i12);
                        }
                        AlertParams.this.mOnCkbClickListener.onClick(hwAlertController.f36560c, i12, listView.isItemChecked(i12));
                    }
                });
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.mOnItemSleListener;
            if (onItemSelectedListener != null) {
                listView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.mIsSingleChoice) {
                listView.setChoiceMode(1);
            } else if (this.mIsMultiChoice) {
                listView.setChoiceMode(2);
            }
            hwAlertController.f36567j = listView;
        }

        public void apply(HwAlertController hwAlertController) {
            HwAlertController hwAlertController2;
            HashMap<Integer, ButtonConfig> hashMap;
            View view = this.mCtmTitleView;
            if (view != null) {
                hwAlertController.setCustomTitle(view);
            } else {
                CharSequence charSequence = this.mTitle;
                if (charSequence != null) {
                    hwAlertController.setTitle(charSequence);
                }
                CharSequence charSequence2 = this.mSubTitle;
                if (charSequence2 != null) {
                    hwAlertController.setSubTitle(charSequence2);
                }
                Drawable drawable = this.mIc;
                if (drawable != null) {
                    hwAlertController.setIcon(drawable);
                }
                int i11 = this.mIcId;
                if (i11 != 0) {
                    hwAlertController.setIcon(i11);
                }
                int i12 = this.mIcAttrId;
                if (i12 != 0) {
                    hwAlertController.setIcon(hwAlertController.getIconAttributeResId(i12));
                }
            }
            HashMap<Integer, ButtonConfig> hashMap2 = hwAlertController.f36574q;
            if (hashMap2 != null && (hashMap = this.btnConfigs) != null) {
                hashMap2.putAll(hashMap);
            }
            CharSequence charSequence3 = this.mMsg;
            if (charSequence3 != null) {
                hwAlertController.setMessage(charSequence3);
            }
            CharSequence charSequence4 = this.mPositiveBtnText;
            if (charSequence4 == null && this.mPositiveBtnIcon == null) {
                hwAlertController2 = hwAlertController;
            } else {
                hwAlertController.setButton(-1, charSequence4, this.mPositiveBtnListener, null, this.mPositiveBtnIcon);
                hwAlertController2 = hwAlertController;
            }
            CharSequence charSequence5 = this.mNegativeBtnText;
            if (charSequence5 != null || this.mNegativeBtnIcon != null) {
                hwAlertController2.setButton(-2, charSequence5, this.mNegativeBtnListener, null, this.mNegativeBtnIcon);
            }
            CharSequence charSequence6 = this.mNeutralBtnText;
            if (charSequence6 != null || this.mNeutralBtnIcon != null) {
                hwAlertController2.setButton(-3, charSequence6, this.mNeutralBtnListener, null, this.mNeutralBtnIcon);
            }
            if (this.mItemArray != null || this.mCursor != null || this.mListAdapter != null) {
                a(hwAlertController2);
            }
            View view2 = this.mView;
            if (view2 != null) {
                if (this.mViewSpcSpecified) {
                    hwAlertController2.setView(view2, this.mViewSpcLeft, this.mViewSpcTop, this.mViewSpcRight, this.mViewSpcBottom);
                    return;
                } else {
                    hwAlertController2.setView(view2);
                    return;
                }
            }
            int i13 = this.mViewLayoutResId;
            if (i13 != 0) {
                hwAlertController2.setView(i13);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        private final int f36606a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36607b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void setHasDecor(boolean z11, boolean z12) {
            if (z11 && z12) {
                return;
            }
            setPadding(getPaddingLeft(), z11 ? getPaddingTop() : this.f36606a, getPaddingRight(), z12 ? getPaddingBottom() : this.f36607b);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f36607b = -1;
            this.f36606a = -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<DialogInterface> f36608a;

        public a(DialogInterface dialogInterface) {
            this.f36608a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == -1 || i11 == -2 || i11 == -3) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f36608a.get(), message.what);
            } else if (i11 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends ArrayAdapter<CharSequence> {
        public b(Context context, int i11, int i12, CharSequence[] charSequenceArr) {
            super(context, i11, i12, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public HwAlertController(Context context, Dialog dialog, Window window) {
        this.f36559b = context;
        this.f36560c = dialog;
        this.f36561d = window;
        this.f36558a = new a(dialog);
        dialog.requestWindowFeature(1);
    }

    private static boolean a(Context context) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        Window window = this.f36561d;
        if (window == null) {
            HMSLog.w("HwAlertController", "mWin is null");
            return;
        }
        View findViewById3 = window.findViewById(ResourceLoaderUtil.getIdId("parentPanel"));
        if (findViewById3 == null) {
            HMSLog.w("HwAlertController", "parentPanel is null");
            return;
        }
        View findViewById4 = findViewById3.findViewById(ResourceLoaderUtil.getIdId("topPanel"));
        View findViewById5 = findViewById3.findViewById(ResourceLoaderUtil.getIdId("contentPanel"));
        View findViewById6 = findViewById3.findViewById(ResourceLoaderUtil.getIdId("buttonPanel"));
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(ResourceLoaderUtil.getIdId("customPanel"));
        if (viewGroup == null) {
            return;
        }
        c(viewGroup);
        View findViewById7 = viewGroup.findViewById(ResourceLoaderUtil.getIdId("topPanel"));
        View findViewById8 = viewGroup.findViewById(ResourceLoaderUtil.getIdId("contentPanel"));
        View findViewById9 = viewGroup.findViewById(ResourceLoaderUtil.getIdId("buttonPanel"));
        ViewGroup a11 = a(findViewById7, findViewById4);
        ViewGroup a12 = a(findViewById8, findViewById5);
        ViewGroup a13 = a(findViewById9, findViewById6);
        if (a12 != null) {
            b(a12);
        }
        if (a13 != null) {
            a(a13);
        }
        if (a11 != null) {
            d(a11);
        }
        boolean z11 = viewGroup.getVisibility() != 8;
        boolean z12 = (a11 == null || a11.getVisibility() == 8) ? 0 : 1;
        boolean z13 = (a13 == null || a13.getVisibility() == 8) ? false : true;
        if (!z13 && a12 != null && (findViewById2 = a12.findViewById(ResourceLoaderUtil.getIdId("textSpacerNoButtons"))) != null) {
            findViewById2.setVisibility(0);
        }
        if (z12 != 0) {
            ScrollView scrollView = this.D;
            if (scrollView != null) {
                scrollView.setClipToPadding(true);
            }
        } else {
            if (a12 != null && (findViewById = a12.findViewById(ResourceLoaderUtil.getIdId("textSpacerNoTitle"))) != null) {
                findViewById.setVisibility(0);
            }
            this.J.setGravity(17);
        }
        ListView listView = this.f36567j;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z12, z13);
        }
        if (!z11) {
            View view = this.f36567j;
            if (view == null) {
                view = this.D;
            }
            if (view != null) {
                a(a12, view, z12 | (z13 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f36567j;
        if (listView2 == null || (listAdapter = this.L) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i11 = this.M;
        if (i11 > -1) {
            listView2.setItemChecked(i11, true);
            listView2.setSelection(i11);
        }
    }

    private void c(ViewGroup viewGroup) {
        View view = this.f36566i;
        if (view == null) {
            view = this.f36568k != 0 ? LayoutInflater.from(this.f36559b).inflate(this.f36568k, viewGroup, false) : null;
        }
        boolean z11 = view != null;
        if (!z11 || !a(view)) {
            this.f36561d.setFlags(131072, 131072);
        }
        if (!z11) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f36561d.findViewById(ResourceLoaderUtil.getIdId("custom"));
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f36569l) {
            frameLayout.setPadding(this.f36570m, this.f36571n, this.f36572o, this.f36573p);
        }
    }

    private void d(ViewGroup viewGroup) {
        int i11 = 0;
        if (this.K != null) {
            viewGroup.addView(this.K, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f36561d.findViewById(ResourceLoaderUtil.getIdId("title_template")).setVisibility(8);
            return;
        }
        this.G = (ImageView) this.f36561d.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f36563f) || !this.N) {
            this.f36561d.findViewById(ResourceLoaderUtil.getIdId("title_template")).setVisibility(8);
            this.G.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f36561d.findViewById(ResourceLoaderUtil.getIdId("alertTitle"));
        this.H = textView;
        textView.setText(this.f36563f);
        int i12 = this.E;
        if (i12 != 0) {
            this.G.setImageResource(i12);
        } else {
            Drawable drawable = this.F;
            if (drawable != null) {
                this.G.setImageDrawable(drawable);
            } else {
                this.H.setPadding(this.G.getPaddingLeft(), this.G.getPaddingTop(), this.G.getPaddingRight(), this.G.getPaddingBottom());
                this.G.setVisibility(8);
            }
        }
        this.I = (TextView) this.f36561d.findViewById(ResourceLoaderUtil.getIdId("subTitle"));
        Context context = this.f36559b;
        int dimensionPixelSize = context == null ? 0 : context.getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_title_layout_min_height"));
        if (this.I == null || TextUtils.isEmpty(this.f36564g)) {
            i11 = dimensionPixelSize;
        } else {
            this.I.setVisibility(0);
            this.I.setText(this.f36564g);
            Context context2 = this.f36559b;
            if (context2 != null) {
                i11 = context2.getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_title_layout_max_height"));
            }
        }
        this.f36561d.findViewById(ResourceLoaderUtil.getIdId("title_template")).setMinimumHeight(i11);
    }

    public Button getButton(int i11) {
        if (i11 == -1) {
            return this.f36575r;
        }
        if (i11 == -2) {
            return this.f36583z;
        }
        if (i11 == -3) {
            return this.f36579v;
        }
        return null;
    }

    public int getIconAttributeResId(int i11) {
        TypedValue typedValue = new TypedValue();
        Context context = this.f36559b;
        if (context == null) {
            HMSLog.w("HwAlertController", "mCtx is null");
        } else {
            context.getTheme().resolveAttribute(i11, typedValue, true);
        }
        return typedValue.resourceId;
    }

    public ListView getListView() {
        return this.f36567j;
    }

    public void installContent() {
        if (this.f36560c != null) {
            this.f36560c.setContentView(a());
        }
        b();
    }

    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        ScrollView scrollView = this.D;
        return scrollView != null && scrollView.executeKeyEvent(keyEvent);
    }

    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        ScrollView scrollView = this.D;
        return scrollView != null && scrollView.executeKeyEvent(keyEvent);
    }

    public void setButton(int i11, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f36558a.obtainMessage(i11, onClickListener);
        }
        if (i11 == -1) {
            this.f36576s = charSequence;
            this.f36577t = message;
            this.f36578u = drawable;
        } else if (i11 == -2) {
            this.A = charSequence;
            this.B = message;
            this.C = drawable;
        } else {
            if (i11 != -3) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f36580w = charSequence;
            this.f36581x = message;
            this.f36582y = drawable;
        }
    }

    public void setButtonPanelLayoutHint(int i11) {
        this.S = i11;
    }

    public void setCustomTitle(View view) {
        this.K = view;
    }

    public void setIcon(int i11) {
        this.F = null;
        this.E = i11;
        ImageView imageView = this.G;
        if (imageView != null) {
            if (i11 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.G.setImageResource(this.E);
            }
        }
    }

    public void setMessage(CharSequence charSequence) {
        this.f36565h = charSequence;
        TextView textView = this.J;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setSubTitle(CharSequence charSequence) {
        this.f36564g = charSequence;
        TextView textView = this.I;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f36563f = charSequence;
        TextView textView = this.H;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setView(int i11) {
        this.f36566i = null;
        this.f36568k = i11;
        this.f36569l = false;
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public void setView(View view) {
        this.f36566i = view;
        this.f36568k = 0;
        this.f36569l = false;
    }

    public void setIcon(Drawable drawable) {
        this.F = drawable;
        this.E = 0;
        ImageView imageView = this.G;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.G.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public void setView(View view, int i11, int i12, int i13, int i14) {
        this.f36566i = view;
        this.f36568k = 0;
        this.f36569l = true;
        this.f36570m = i11;
        this.f36571n = i12;
        this.f36572o = i13;
        this.f36573p = i14;
    }

    private int a() {
        int i11 = this.mBtnPanelSideLayout;
        if (i11 == 0) {
            return this.mAlertDialogLayout;
        }
        return this.S == 1 ? i11 : this.mAlertDialogLayout;
    }

    private ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private void a(ViewGroup viewGroup, View view, int i11, int i12) {
        View findViewById = this.f36561d.findViewById(ResourceLoaderUtil.getIdId("scrollIndicatorUp"));
        View findViewById2 = this.f36561d.findViewById(ResourceLoaderUtil.getIdId("scrollIndicatorDown"));
        view.setScrollIndicators(i11, i12);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    public static void a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private void a(ViewGroup viewGroup) {
        int i11;
        Context context = this.f36559b;
        int color = context == null ? 0 : context.getResources().getColor(ResourceLoaderUtil.getColorId("hw_cloud_dialog_button_text_color"));
        Context context2 = this.f36559b;
        int dimensionPixelSize = context2 == null ? 0 : context2.getResources().getDimensionPixelSize(ResourceLoaderUtil.getDimenId("hw_cloud_dialog_button_text_size"));
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f36575r = button;
        button.setOnClickListener(this.T);
        if (TextUtils.isEmpty(this.f36576s) && this.f36578u == null) {
            this.f36575r.setVisibility(8);
            i11 = 0;
        } else {
            this.f36575r.setText(this.f36576s);
            Drawable drawable = this.f36578u;
            if (drawable != null) {
                int i12 = this.f36562e;
                drawable.setBounds(0, 0, i12, i12);
                this.f36575r.setCompoundDrawables(this.f36578u, null, null, null);
            }
            a(this.f36575r, this.f36574q.get(-1), color, dimensionPixelSize);
            this.f36575r.setVisibility(0);
            i11 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f36583z = button2;
        button2.setOnClickListener(this.T);
        if (TextUtils.isEmpty(this.A) && this.C == null) {
            this.f36583z.setVisibility(8);
        } else {
            this.f36583z.setText(this.A);
            Drawable drawable2 = this.C;
            if (drawable2 != null) {
                int i13 = this.f36562e;
                drawable2.setBounds(0, 0, i13, i13);
                this.f36583z.setCompoundDrawables(this.C, null, null, null);
            }
            a(this.f36583z, this.f36574q.get(-2), color, dimensionPixelSize);
            this.f36583z.setVisibility(0);
            i11 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f36579v = button3;
        button3.setOnClickListener(this.T);
        if (TextUtils.isEmpty(this.f36580w) && this.f36582y == null) {
            this.f36579v.setVisibility(8);
        } else {
            this.f36579v.setText(this.f36580w);
            Drawable drawable3 = this.f36582y;
            if (drawable3 != null) {
                int i14 = this.f36562e;
                drawable3.setBounds(0, 0, i14, i14);
                this.f36579v.setCompoundDrawables(this.f36582y, null, null, null);
            }
            a(this.f36579v, this.f36574q.get(-3), color, dimensionPixelSize);
            this.f36579v.setVisibility(0);
            i11 |= 4;
        }
        if (a(this.f36559b)) {
            if (i11 == 1) {
                a(this.f36575r);
            } else if (i11 == 2) {
                a(this.f36583z);
            } else if (i11 == 4) {
                a(this.f36579v);
            }
        }
        if (i11 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void b(ViewGroup viewGroup) {
        View findViewById = this.f36561d.findViewById(ResourceLoaderUtil.getIdId("scrollView"));
        if (findViewById instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) findViewById;
            this.D = scrollView;
            scrollView.setFocusable(false);
            this.D.setNestedScrollingEnabled(false);
            TextView textView = (TextView) viewGroup.findViewById(R.id.message);
            this.J = textView;
            if (textView == null) {
                return;
            }
            CharSequence charSequence = this.f36565h;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.D.removeView(this.J);
            if (this.f36567j != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.D.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.D);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f36567j, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements AbsListView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        private final View f36609a;

        /* renamed from: b, reason: collision with root package name */
        private final View f36610b;

        public c(View view, View view2) {
            this.f36609a = view;
            this.f36610b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            HwAlertController.a(absListView, this.f36609a, this.f36610b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
        }
    }

    private void a(Button button, ButtonConfig buttonConfig, int i11, int i12) {
        if (button == null) {
            return;
        }
        String str = Build.MANUFACTURER;
        ButtonConfig.Level level = buttonConfig.f36542f;
        ButtonConfig.Level level2 = ButtonConfig.Level.NORMAL;
        if (level == level2 && (i11 > 0 || (str != null && str.equals(SystemUtils.PRODUCT_HUAWEI)))) {
            buttonConfig.f36539c = i11;
            buttonConfig.f36540d = i11;
        }
        if (i12 > 0 && buttonConfig.f36542f == level2) {
            buttonConfig.f36541e = i12;
        }
        HwDialogUtil.a(button, buttonConfig.f36537a, buttonConfig.f36538b);
        HwDialogUtil.b(button, buttonConfig.f36539c, buttonConfig.f36540d);
        button.setTextSize(0, buttonConfig.f36541e);
    }

    private void a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
