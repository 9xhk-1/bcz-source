package com.baicizhan.client.business.widget;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.client.business.util.SystemUtil;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.online.bs_users.BSUsers;
import com.jiongji.andriod.card.R;
import rb.d;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WordErrFeedbackFragment extends com.baicizhan.client.business.widget.a implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: k, reason: collision with root package name */
    public static final String f17252k = "word";

    /* renamed from: l, reason: collision with root package name */
    public static final String f17253l = "portrait";

    /* renamed from: m, reason: collision with root package name */
    public static final int f17254m = 400;

    /* renamed from: e, reason: collision with root package name */
    public Word f17255e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17256f = false;

    /* renamed from: g, reason: collision with root package name */
    public View f17257g;

    /* renamed from: h, reason: collision with root package name */
    public View f17258h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f17259i;

    /* renamed from: j, reason: collision with root package name */
    public c f17260j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Word implements Parcelable {
        public static final Parcelable.Creator<Word> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f17261a;

        /* renamed from: b, reason: collision with root package name */
        public String f17262b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<Word> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Word createFromParcel(Parcel parcel) {
                return new Word(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Word[] newArray(int size) {
                return new Word[size];
            }
        }

        public Word() {
        }

        public int a() {
            return this.f17261a;
        }

        public String b() {
            return this.f17262b;
        }

        public void c(int id2) {
            this.f17261a = id2;
        }

        public void d(String word) {
            this.f17262b = word;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i11) {
            dest.writeInt(this.f17261a);
            dest.writeString(this.f17262b);
        }

        public Word(Parcel in2) {
            this.f17261a = in2.readInt();
            this.f17262b = in2.readString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements TextView.OnEditorActionListener {
        public a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView v11, int actionId, KeyEvent event) {
            if (actionId != 2) {
                SystemUtil.hideIME(v11);
                return true;
            }
            WordErrFeedbackFragment wordErrFeedbackFragment = WordErrFeedbackFragment.this;
            wordErrFeedbackFragment.B(wordErrFeedbackFragment.f17255e.a());
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends ThriftRequest<BSUsers.Client, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17264a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17265b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String domain, final int val$wordid, final String val$content) {
            super(domain);
            this.f17264a = val$wordid;
            this.f17265b = val$content;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(BSUsers.Client client) throws Exception {
            return Integer.valueOf(client.add_word_friend_feedback(this.f17264a, this.f17265b));
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Integer result) {
            if (result.intValue() == 0) {
                WordErrFeedbackFragment.C(R.string.word_error_feedback_success);
            } else {
                WordErrFeedbackFragment.C(R.string.word_error_feedback_failed);
            }
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            WordErrFeedbackFragment.C(R.string.word_error_feedback_failed);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void j();
    }

    public static WordErrFeedbackFragment A(Word word, boolean portrait) {
        WordErrFeedbackFragment wordErrFeedbackFragment = new WordErrFeedbackFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("word", word);
        bundle.putBoolean(f17253l, portrait);
        wordErrFeedbackFragment.setArguments(bundle);
        return wordErrFeedbackFragment;
    }

    public static void C(int resId) {
        if (pb.a.a() == null) {
            return;
        }
        g.g(resId, 0);
    }

    public final void B(final int wordid) {
        SystemUtil.hideIME(this.f17259i);
        String obj = this.f17259i.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            C(R.string.word_error_feedback_no_content);
            dismiss();
        } else if (!d.f(getActivity())) {
            C(R.string.word_error_feedback_failed_net);
            dismiss();
        } else {
            C(R.string.word_error_feedback_start);
            com.baicizhan.client.business.thrift.c.b().a(new b("/rpc/users", wordid, obj));
            dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        this.f17281a.f(getView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f17260j = (c) activity;
        } catch (ClassCastException unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f17257g) {
            B(this.f17255e.a());
        } else if (view == this.f17258h) {
            dismiss();
        }
    }

    @Override // com.baicizhan.client.business.widget.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            this.f17255e = (Word) savedInstanceState.getParcelable("word");
            this.f17256f = savedInstanceState.getBoolean(f17253l);
        } else {
            this.f17255e = getArguments() != null ? (Word) getArguments().getParcelable("word") : null;
            this.f17256f = getArguments() != null ? getArguments().getBoolean(f17253l) : this.f17256f;
        }
        v(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(this.f17256f ? R.layout.fragment_word_error_feedback_portrait : R.layout.fragment_word_error_feedback, container);
        inflate.findViewById(R.id.fb_window).setOnClickListener(this);
        ((TextView) inflate.findViewById(R.id.fb_title)).setText(getString(R.string.word_error_feedback_title, this.f17255e.b()));
        ((TextView) inflate.findViewById(R.id.fb_limit)).setText(getString(R.string.word_error_feedback_limit, 400));
        this.f17257g = inflate.findViewById(R.id.fb_submit);
        ThemeResUtil.setSubmitBtnShape(getActivity(), this.f17257g);
        this.f17257g.setOnClickListener(this);
        View findViewById = inflate.findViewById(R.id.fb_cancel);
        this.f17258h = findViewById;
        findViewById.setOnClickListener(this);
        EditText editText = (EditText) inflate.findViewById(R.id.fb_edit);
        this.f17259i = editText;
        editText.setMaxLines(400);
        this.f17259i.setOnEditorActionListener(new a());
        View findViewById2 = inflate.findViewById(R.id.fb_bg_mask);
        this.f17281a.d(findViewById2);
        this.f17281a.e(inflate);
        findViewById2.setOnTouchListener(this);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        c cVar = this.f17260j;
        if (cVar != null) {
            cVar.j();
        }
        this.f17260j = null;
    }

    @Override // com.baicizhan.client.business.widget.a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f17281a.g();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable("word", this.f17255e);
        outState.putBoolean(f17253l, this.f17256f);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        SystemUtil.hideIME(view);
        return false;
    }
}
