package com.benmu.bmreport.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.benmu.bmreport.R;


/**
 * @author dfh
 */
public class MMAlertDialog extends Dialog {

    public void show(float width) {
        try {
            WindowManager.LayoutParams params = getWindow().getAttributes();
            params.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
            params.dimAmount = 0.5f;
            super.show();
            DisplayMetrics metrics = new DisplayMetrics();
            getWindow().getWindowManager().getDefaultDisplay().getMetrics(metrics);
            params.width = (int) (metrics.widthPixels * width);
            getWindow().setAttributes(params);
        } catch (Exception ex) {
        }
    }

    @Override
    public void show() {
        super.show();
        //getWindow().setWindowAnimations(R.style.AlertAnim);
        WindowManager m = getWindow().getWindowManager();
        Display display = m.getDefaultDisplay(); //  获取屏幕宽、高用
        WindowManager.LayoutParams params = getWindow().getAttributes(); // 获取对话框当前的参数值
        params.width = (int) (display.getWidth() * 0.9); // 宽度设置为屏幕的0.9
        getWindow().setAttributes(params);

    }

    public MMAlertDialog(Context context, int theme) {
        super(context, theme);
    }

    public MMAlertDialog(Context context) {
        super(context);
    }

    public void setMessage(CharSequence message) {
        TextView messageView = (TextView) findViewById(android.R.id.message);
        if (messageView != null) {
            messageView.setText(message);
        }
    }

    /**
     * Helper class for creating a custom dialog
     */
    public static class Builder {

        private Context context;
        private CharSequence title;
        private CharSequence message;
        private CharSequence positiveButtonText;
        private CharSequence negativeButtonText;
        private boolean positiveShow = true;
        private View view;
        private boolean cancelable = true;

        private DialogInterface.OnClickListener positiveButtonClickListener, negativeButtonClickListener;

        public Builder(Context context) {
            this.context = context;
        }

        /**
         * Set the Dialog message from String
         *
         * @param
         * @return
         */
        public Builder setMessage(CharSequence message) {
            this.message = message;
            return this;
        }

        /**
         * Set the Dialog message from resource
         *
         * @param
         * @return
         */
        public Builder setMessage(int message) {
            this.message = (String) context.getText(message);
            return this;
        }

        /**
         * Set the Dialog title from resource
         *
         * @param title
         * @return
         */
        public Builder setTitle(int title) {
            this.title = (String) context.getText(title);
            return this;
        }

        /**
         * Set the Dialog title from String
         *
         * @param title
         * @return
         */
        public Builder setTitle(CharSequence title) {
            this.title = title;
            return this;
        }

        /**
         * Set the Dialog view
         *
         * @param view
         * @return
         */
        public Builder setView(View view) {
            this.view = view;
            return this;
        }

        /**
         * Set the Dialog view
         *
         * @param
         * @return
         */
        public Builder setCancelable(boolean cancelable) {
            this.cancelable = cancelable;
            return this;
        }

        /**
         * Set the positive button resource and it's listener
         *
         * @param positiveButtonText
         * @param listener
         * @return
         */
        public Builder setPositiveButton(int positiveButtonText, DialogInterface.OnClickListener listener) {
            return setPositiveButton(context.getText(positiveButtonText), listener);
        }

        /**
         * Set the positive button text and it's listener
         *
         * @param positiveButtonText
         * @param listener
         * @return
         */
        public Builder setPositiveButton(CharSequence positiveButtonText, DialogInterface.OnClickListener listener) {
            this.positiveButtonText = positiveButtonText;
            this.positiveButtonClickListener = listener;

            return this;
        }

        /**
         * Set the negative button resource and it's listener
         *
         * @param negativeButtonText
         * @param listener
         * @return
         */
        public Builder setNegativeButton(int negativeButtonText, DialogInterface.OnClickListener listener) {
            return setNegativeButton(context.getText(negativeButtonText), listener);
        }

        /**
         * Set the negative button text and it's listener
         *
         * @param negativeButtonText
         * @param listener
         * @return
         */
        public Builder setNegativeButton(CharSequence negativeButtonText, DialogInterface.OnClickListener listener) {
            this.negativeButtonText = negativeButtonText;
            this.negativeButtonClickListener = listener;
            return this;
        }

        public Builder setNegativeButton(int type, CharSequence negativeButtonText, DialogInterface.OnClickListener listener) {
            if (type == 1)
                this.positiveShow = false;
            this.negativeButtonText = negativeButtonText;
            this.negativeButtonClickListener = listener;
            return this;
        }

        /**
         * Create the custom dialog
         */

       private TextView sbtn_p;
        private TextView sbtn_n;


        public TextView getPositieButton(){
            return this.sbtn_p;

        }

        public TextView getNegativeButton(){
            return  this.sbtn_n;

        }
        public MMAlertDialog create() {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // instantiate the dialog with the custom Theme
            final MMAlertDialog dialog = new MMAlertDialog(context, R.style.gAlertDialogTheme);
            View layout = inflater.inflate(R.layout.layout_dialog, null);
            dialog.setContentView(layout);

            View layout_title = layout.findViewById(R.id.layout_title);
            TextView tv_title = (TextView) layout.findViewById(R.id.tv_title);
            TextView tv_message = ((TextView) layout.findViewById(R.id.tv_content));
             sbtn_p = (TextView) layout.findViewById(R.id.tv_confirm);
            if (!positiveShow)
                sbtn_p.setVisibility(View.GONE);
             sbtn_n = (TextView) layout.findViewById(R.id.tv_cancel);
            FrameLayout frame_view = (FrameLayout) layout.findViewById(R.id.frame_view);
            tv_message.setMovementMethod(LinkMovementMethod.getInstance());

            View.OnClickListener btnListener = new View.OnClickListener() {
                public void onClick(View v) {
                    int itemId = v.getId();
                    if (itemId == R.id.tv_confirm) {
                        if (positiveButtonClickListener != null) {
                            positiveButtonClickListener.onClick(dialog, DialogInterface.BUTTON_POSITIVE);
                            dialog.dismiss();
                        } else {
                            dialog.dismiss();
                        }
                    }
                    if (itemId == R.id.tv_cancel) {
                        if (negativeButtonClickListener != null) {
                            negativeButtonClickListener.onClick(dialog, DialogInterface.BUTTON_NEGATIVE);
                            dialog.dismiss();
                        } else {
                            dialog.dismiss();
                        }
                    }
                }
            };
            // set the dialog title
            if (title != null) {
                tv_title.setText(title);
                layout_title.setVisibility(View.VISIBLE);
            } else {
                layout_title.setVisibility(View.GONE);
            }

            // set the confirm button
            if (positiveButtonText != null) {
                sbtn_p.setText(positiveButtonText);
                sbtn_p.setOnClickListener(btnListener);
            } else {
                // if no confirm button just set the visibility to GONE
                sbtn_p.setVisibility(View.GONE);
            }

            // set the cancel button
            if (negativeButtonText != null) {
                sbtn_n.setText(negativeButtonText);
                sbtn_n.setOnClickListener(btnListener);
            } else {
                // if no confirm button just set the visibility to GONE
                sbtn_n.setVisibility(View.GONE);
                sbtn_p.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT));
            }

            // set the content message
            if (message != null) {
                tv_message.setText(message);
            } else {
                tv_message.setVisibility(View.GONE);
            }
            if (view != null) {
                frame_view.setVisibility(View.VISIBLE);
                frame_view.addView(view);
            }
            dialog.setContentView(layout);
            dialog.setCancelable(cancelable);
            return dialog;
        }

        public MMAlertDialog show() {
            MMAlertDialog dialog = create();
            dialog.show();
            return dialog;
        }

    }
}