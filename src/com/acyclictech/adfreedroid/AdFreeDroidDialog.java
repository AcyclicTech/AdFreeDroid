package com.acyclictech.adfreedroid;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AdFreeDroidDialog extends DialogFragment {

	 int mNum;
	private TextView text;
	private Button button;
	private String message;
	private String buttonText;

	    /**
	     * Create a new instance of MyDialogFragment, providing "num"
	     * as an argument.
	     */
	    
	    public void show(Activity activity){
	    	setStyle(STYLE_NO_TITLE, 0);
        	FragmentTransaction ft = activity.getFragmentManager().beginTransaction();
            Fragment prev = activity.getFragmentManager().findFragmentByTag("dialog");
            if (prev != null) {
                ft.remove(prev);
            }
            ft.addToBackStack(null);

            // Create and show the dialog.
            show(ft, "dialog");

	    }

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
//	        mNum = getArguments().getInt("num");
//
//	        // Pick a style based on the num.
//	        int style = DialogFragment.STYLE_NORMAL, theme = 0;
//	        switch ((mNum-1)%6) {
//	            case 1: style = DialogFragment.STYLE_NO_TITLE; break;
//	            case 2: style = DialogFragment.STYLE_NO_FRAME; break;
//	            case 3: style = DialogFragment.STYLE_NO_INPUT; break;
//	            case 4: style = DialogFragment.STYLE_NORMAL; break;
//	            case 5: style = DialogFragment.STYLE_NORMAL; break;
//	            case 6: style = DialogFragment.STYLE_NO_TITLE; break;
//	            case 7: style = DialogFragment.STYLE_NO_FRAME; break;
//	            case 8: style = DialogFragment.STYLE_NORMAL; break;
//	        }
//	        switch ((mNum-1)%6) {
//	            case 4: theme = android.R.style.Theme_Holo; break;
//	            case 5: theme = android.R.style.Theme_Holo_Light_Dialog; break;
//	            case 6: theme = android.R.style.Theme_Holo_Light; break;
//	            case 7: theme = android.R.style.Theme_Holo_Light_Panel; break;
//	            case 8: theme = android.R.style.Theme_Holo_Light; break;
//	        }
//	        setStyle(style, theme);
	    }

	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	    	LinearLayout layout = new LinearLayout(getActivity());
	    	layout.setOrientation(LinearLayout.VERTICAL);
	    	text = new TextView(getActivity());
	    	button = new Button(getActivity());
	    	layout.addView(text);
	    	layout.addView(button);
	    	
	    	if(message != null){
	    		text.setText(message);
	    	}else{
	    		text.setText(R.string.default_message);
	    	}
	    	if(buttonText != null){
	    		button.setText(buttonText);
	    	}else{
	    		button.setText(R.string.donate_button);
	    	}

	    	button.setOnClickListener(new OnClickListener() {
	            public void onClick(View v) {
	                // When button is clicked, call up to owning activity.
//	            	FragmentTransaction ft = getFragmentManager().beginTransaction();
//	                Fragment prev = getFragmentManager().findFragmentByTag("dialog");
//	                if (prev != null) {
//	                    ft.remove(prev);
//	                }
//	                ft.addToBackStack(null);
//
//	                // Create and show the dialog.
//	                DialogFragment newFragment = DroidAdFreeDialog.newInstance(0);
//	                newFragment.show(ft, "dialog");
	              }
	        });
	        return layout;
	    }
	    
	    public void setMessageText(String message){
	    	this.message = message;
	    }
	    
	    public void setButtonText(String buttonText){
	    	this.buttonText = buttonText;
	    }
}
