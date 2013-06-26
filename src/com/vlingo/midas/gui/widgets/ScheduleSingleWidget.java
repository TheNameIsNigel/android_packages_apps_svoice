package com.vlingo.midas.gui.widgets;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vlingo.core.internal.dialogmanager.DecoratorType;
import com.vlingo.core.internal.dialogmanager.WidgetDecorator;
import com.vlingo.core.internal.dialogmanager.util.WidgetUtil.WidgetKey;
import com.vlingo.core.internal.dialogmanager.vvs.WidgetActionListener;
import com.vlingo.core.internal.schedule.ScheduleEvent;
import com.vlingo.core.internal.util.StringUtils;
import com.vlingo.midas.gui.customviews.Button;
import com.vlingo.midas.settings.MidasSettings;
import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ScheduleSingleWidget extends BargeInWidget<ScheduleEvent>
  implements View.OnClickListener, View.OnTouchListener
{
  boolean checkLocation = false;
  boolean checkParticipants = false;
  boolean isParticipants = false;
  boolean isSaveButton = false;
  boolean isloaction = false;
  protected WidgetActionListener mActionListener;
  private TextView mAttendee;
  protected Button mCancel;
  protected Button mConfirm;
  private Context mContext;
  private TextView mDay;
  private TextView mLocation;
  private TextView mMonth;
  private View mRowButtonline;
  private LinearLayout mRowDate;
  private LinearLayout mRowLocation;
  private View mRowLocationline;
  private LinearLayout mRowParticipants;
  private View mRowParticipantsline;
  private LinearLayout mRowTitle;
  private View mRowTitleline;
  private ScheduleEvent mScheduleEvent;
  private TextView mTime;
  private TextView mTitle;
  private TextView mWeek;
  private int participants_line = 55;
  private LinearLayout scheduleContainer;
  private LinearLayout schedule_button;

  public ScheduleSingleWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  private void initialize(ScheduleEvent paramScheduleEvent)
  {
    this.mScheduleEvent = paramScheduleEvent;
    this.mRowTitleline.setVisibility(0);
    label274: String str2;
    String str3;
    String str4;
    String str5;
    String str1;
    label552: List localList;
    if (StringUtils.isNullOrWhiteSpace(this.mScheduleEvent.getTitle()))
    {
      this.mTitle.setText(2131362571);
      long l1 = this.mScheduleEvent.getBegin();
      long l2 = this.mScheduleEvent.getEnd();
      if (l1 == 0L)
        break label672;
      Calendar localCalendar3 = Calendar.getInstance();
      localCalendar3.setTime(new Date(this.mScheduleEvent.getBegin()));
      String str8 = localCalendar3.getDisplayName(7, 2, MidasSettings.getCurrentLocale());
      String str9 = String.valueOf(localCalendar3.get(5));
      String str10 = localCalendar3.getDisplayName(2, 2, MidasSettings.getCurrentLocale());
      if (str9.length() == 1)
        str9 = "0" + str9;
      this.mDay.setText(str9);
      this.mMonth.setText(str10.substring(0, 1).toUpperCase() + str10.substring(1));
      this.mWeek.setText(str8.substring(0, 1).toUpperCase() + str8.substring(1));
      if (!this.mScheduleEvent.getAllDay())
        break label655;
      this.mTime.setText("All Day");
      this.mTime.setText(this.mContext.getResources().getString(2131362551));
      if ((!paramScheduleEvent.getAllDay()) && (l2 != 0L))
      {
        Calendar localCalendar1 = Calendar.getInstance();
        localCalendar1.setTime(new Date(this.mScheduleEvent.getBegin()));
        str2 = String.valueOf(localCalendar1.get(11));
        str3 = String.valueOf(localCalendar1.get(12));
        Calendar localCalendar2 = Calendar.getInstance();
        localCalendar2.setTime(new Date(this.mScheduleEvent.getEnd()));
        str4 = String.valueOf(localCalendar2.get(11));
        str5 = String.valueOf(localCalendar2.get(12));
        if (str5.length() == 1)
          str5 = "0" + str5;
        if (str4.length() == 1)
          str4 = "0" + str4;
        if (!DateFormat.is24HourFormat(this.mContext))
          break label684;
        this.mTime.setText(this.mScheduleEvent.getBeginTime() + " - " + str4 + ":" + str5);
      }
      str1 = this.mScheduleEvent.getLocation();
      if (!StringUtils.isNullOrWhiteSpace(str1))
        break label1444;
      this.mRowLocationline.setVisibility(8);
      this.mRowLocation.setVisibility(8);
      this.mLocation.setText("");
      this.checkLocation = false;
      localList = this.mScheduleEvent.getAttendeeNames();
      if ((localList != null) && (localList.size() != 0))
        break label1469;
      this.checkParticipants = false;
      this.mRowParticipantsline.setVisibility(8);
      this.mRowParticipants.setVisibility(8);
      this.mAttendee.setText("");
      label608: if (this.mAttendee.getText() == "")
      {
        if (this.mLocation.getText() != "")
          break label1632;
        this.isloaction = true;
      }
    }
    while (true)
    {
      return;
      this.mTitle.setText(this.mScheduleEvent.getTitle());
      break;
      label655: this.mTime.setText(this.mScheduleEvent.getBeginTime());
      break label274;
      label672: this.mTime.setVisibility(8);
      break label274;
      label684: String str6 = str2;
      String str7 = str4;
      int m = Integer.parseInt(str2);
      int n = Integer.parseInt(str4);
      if (str3.length() == 1)
        str3 = "0" + str3;
      if ((m <= 9) && (m > 0))
      {
        str6 = "0" + String.valueOf(m);
        str3 = str3 + getResources().getString(2131362516);
        label803: if ((n > 9) || (n <= 0))
          break label1184;
        str7 = "0" + String.valueOf(n);
        str5 = str5 + getResources().getString(2131362516);
      }
      while (true)
      {
        this.mTime.setText(str6 + ":" + str3 + " - " + str7 + ":" + str5);
        break;
        if ((m <= 21) && (m > 12))
        {
          int i2 = m - 12;
          str6 = "0" + String.valueOf(i2);
          str3 = str3 + getResources().getString(2131362520);
          break label803;
        }
        if (m > 21)
        {
          str6 = String.valueOf(m - 12);
          str3 = str3 + getResources().getString(2131362520);
          break label803;
        }
        if ((m > 9) && (m < 12))
        {
          str3 = str3 + getResources().getString(2131362516);
          break label803;
        }
        if (m == 0)
        {
          str6 = "12";
          str3 = str3 + getResources().getString(2131362516);
          break label803;
        }
        if (m != 12)
          break label803;
        str6 = String.valueOf(m);
        str3 = str3 + getResources().getString(2131362520);
        break label803;
        label1184: if ((n > 9) && (n < 12))
        {
          str5 = str5 + getResources().getString(2131362516);
          continue;
        }
        if ((n <= 21) && (n > 12))
        {
          int i1 = n - 12;
          str7 = "0" + String.valueOf(i1);
          str5 = str5 + getResources().getString(2131362520);
          continue;
        }
        if (n > 21)
        {
          str7 = String.valueOf(n - 12);
          str5 = str5 + getResources().getString(2131362520);
          continue;
        }
        if (n == 0)
        {
          str7 = "12";
          str5 = str5 + getResources().getString(2131362516);
          continue;
        }
        if (n != 12)
          continue;
        str7 = String.valueOf(n);
        str5 = str5 + getResources().getString(2131362520);
      }
      label1444: this.checkLocation = true;
      this.mRowLocationline.setVisibility(0);
      this.mLocation.setText(str1);
      break label552;
      label1469: this.mRowParticipantsline.setVisibility(0);
      this.checkParticipants = true;
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 0; ; i++)
      {
        int j = -1 + localList.size();
        if (i >= j)
          break;
        localStringBuilder.append((String)localList.get(i) + ", ");
      }
      localStringBuilder.append((String)localList.get(-1 + localList.size()));
      this.mAttendee.setText(localStringBuilder);
      int k = this.mAttendee.getText().length() / 30;
      if (k <= 0)
        break label608;
      this.mAttendee.setHeight(this.participants_line * (k + 1));
      break label608;
      label1632: this.isParticipants = true;
    }
  }

  public void initialize(ScheduleEvent paramScheduleEvent, WidgetDecorator paramWidgetDecorator, WidgetUtil.WidgetKey paramWidgetKey, WidgetActionListener paramWidgetActionListener)
  {
    initialize(paramScheduleEvent);
    if (paramWidgetDecorator != null);
    try
    {
      if (!paramWidgetDecorator.has(DecoratorType.ConfirmButton))
      {
        this.schedule_button.setVisibility(8);
        this.mConfirm.setVisibility(8);
        this.mCancel.setVisibility(8);
      }
      while (true)
      {
        label46: if (paramWidgetActionListener != null)
          this.mActionListener = paramWidgetActionListener;
        return;
        this.mConfirm.setVisibility(0);
      }
    }
    catch (InvalidParameterException localInvalidParameterException)
    {
      break label46;
    }
    catch (Exception localException)
    {
      break label46;
    }
  }

  public boolean isTranslated()
  {
    return false;
  }

  public boolean isWidgetReplaceable()
  {
    return false;
  }

  public void launchSchedule()
  {
    Intent localIntent = new Intent("com.vlingo.core.internal.dialogmanager.View");
    this.mActionListener.handleIntent(localIntent, this.mScheduleEvent);
    this.mRowDate.setOnTouchListener(null);
    this.mRowTitle.setOnTouchListener(null);
    this.mRowLocation.setOnTouchListener(null);
    this.mRowParticipants.setOnTouchListener(null);
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
    case 2131559129:
    }
    while (true)
    {
      return;
      try
      {
        if (this.mActionListener == null)
          continue;
        this.mActionListener.handleIntent(new Intent("com.vlingo.core.internal.dialogmanager.Default"), null);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
      }
      catch (Exception localException)
      {
      }
    }
  }

  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.mDay = ((TextView)findViewById(2131558950));
    this.mMonth = ((TextView)findViewById(2131559123));
    this.mWeek = ((TextView)findViewById(2131559124));
    this.mRowTitle = ((LinearLayout)findViewById(2131559125));
    this.mTitle = ((TextView)findViewById(2131558708));
    this.mTitle.setOnFocusChangeListener(new ScheduleSingleWidget.1(this));
    this.mTime = ((TextView)findViewById(2131558709));
    this.mRowLocation = ((LinearLayout)findViewById(2131558952));
    this.mLocation = ((TextView)findViewById(2131558954));
    this.mRowParticipants = ((LinearLayout)findViewById(2131558956));
    this.mAttendee = ((TextView)findViewById(2131558958));
    this.schedule_button = ((LinearLayout)findViewById(2131559127));
    this.mConfirm = ((Button)findViewById(2131559129));
    this.mCancel = ((Button)findViewById(2131559128));
    this.scheduleContainer = ((LinearLayout)findViewById(2131559121));
    this.mRowParticipantsline = findViewById(2131558959);
    this.mRowLocationline = findViewById(2131558955);
    this.mRowTitleline = findViewById(2131558951);
    this.mRowButtonline = findViewById(2131559126);
    this.mRowDate = ((LinearLayout)findViewById(2131559122));
    this.mConfirm.setOnClickListener(this);
    this.mRowDate.setOnTouchListener(this);
    this.mRowTitle.setOnTouchListener(this);
    this.mRowLocation.setOnTouchListener(this);
    this.mRowParticipants.setOnTouchListener(this);
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0);
    switch (paramView.getId())
    {
    default:
      if (paramMotionEvent.getAction() == 1);
      switch (paramView.getId())
      {
      default:
        label108: launchSchedule();
        if (paramMotionEvent.getAction() == 3)
          switch (paramView.getId())
          {
          default:
          case 2131559122:
          case 2131559125:
          case 2131558952:
          case 2131558956:
          }
      case 2131559122:
      case 2131559125:
      case 2131558952:
      case 2131558956:
      }
    case 2131559122:
    case 2131559125:
    case 2131558952:
    case 2131558956:
    }
    while (true)
    {
      return true;
      this.mRowDate.setBackgroundResource(2130838155);
      break;
      if (this.isloaction == true)
      {
        if (!this.mConfirm.isShown())
        {
          this.mRowTitle.setBackgroundResource(2130838157);
          break;
        }
        this.mRowTitle.setBackgroundResource(2130838156);
        break;
      }
      if ((this.checkParticipants == true) && (!this.checkLocation))
      {
        this.mRowParticipantsline.setVisibility(4);
        this.mRowTitle.setBackgroundResource(2130838156);
        break;
      }
      this.mRowLocationline.setVisibility(4);
      this.mRowTitle.setBackgroundResource(2130838156);
      break;
      this.mRowLocationline.setVisibility(4);
      if (this.isParticipants == true)
      {
        this.mRowLocationline.setVisibility(4);
        if (!this.mConfirm.isShown())
        {
          this.mRowLocation.setBackgroundResource(2130838157);
          break;
        }
        this.mRowLocation.setBackgroundResource(2130838156);
        break;
      }
      this.mRowLocationline.setVisibility(4);
      this.mRowParticipantsline.setVisibility(4);
      this.mRowLocation.setBackgroundResource(2130838156);
      break;
      if (!this.mConfirm.isShown())
        this.mRowParticipants.setBackgroundResource(2130838157);
      while (true)
      {
        this.mRowParticipantsline.setVisibility(4);
        break;
        this.mRowParticipants.setBackgroundResource(2130838156);
      }
      this.mRowDate.setBackgroundResource(2130838137);
      break label108;
      if (this.isloaction == true)
      {
        this.mRowTitle.setBackgroundResource(0);
        break label108;
      }
      if ((this.checkParticipants == true) && (!this.checkLocation))
      {
        this.mRowParticipantsline.setVisibility(0);
        this.mRowTitle.setBackgroundResource(0);
        break label108;
      }
      this.mRowLocationline.setVisibility(0);
      this.mRowTitle.setBackgroundResource(0);
      break label108;
      if (this.isParticipants == true)
      {
        this.mRowLocationline.setVisibility(0);
        this.mRowLocation.setBackgroundResource(0);
        break label108;
      }
      this.mRowLocationline.setVisibility(0);
      this.mRowParticipantsline.setVisibility(0);
      this.mRowLocation.setBackgroundResource(0);
      break label108;
      this.mRowParticipants.setBackgroundResource(0);
      this.mRowParticipantsline.setVisibility(0);
      break label108;
      this.mRowDate.setBackgroundResource(2130838137);
      continue;
      if (this.isloaction == true)
      {
        this.mRowTitle.setBackgroundResource(0);
        continue;
      }
      if ((this.checkParticipants == true) && (!this.checkLocation))
      {
        this.mRowParticipantsline.setVisibility(0);
        this.mRowTitle.setBackgroundResource(0);
        continue;
      }
      this.mRowLocationline.setVisibility(0);
      this.mRowTitle.setBackgroundResource(0);
      continue;
      if (this.isParticipants == true)
      {
        this.mRowLocationline.setVisibility(0);
        this.mRowLocation.setBackgroundResource(0);
        continue;
      }
      this.mRowLocationline.setVisibility(0);
      this.mRowParticipantsline.setVisibility(0);
      this.mRowLocation.setBackgroundResource(0);
      continue;
      this.mRowParticipants.setBackgroundResource(0);
      this.mRowParticipantsline.setVisibility(0);
    }
  }
}

/* Location:           C:\Users\nigeluno\Desktop\APK2Java\tools\classes-dex2jar.jar
 * Qualified Name:     com.vlingo.midas.gui.widgets.ScheduleSingleWidget
 * JD-Core Version:    0.6.0
 */