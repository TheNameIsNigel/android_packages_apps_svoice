package com.vlingo.core.internal.dialogmanager.vvs.handlers;

import com.vlingo.core.internal.dialogmanager.util.VLActionUtil;
import com.vlingo.core.internal.dialogmanager.vvs.VVSActionHandler;
import com.vlingo.core.internal.dialogmanager.vvs.VVSActionHandlerListener;
import com.vlingo.core.internal.util.StringUtils;
import com.vlingo.sdk.recognition.VLAction;

public class ShowUserTurnHandler extends VVSActionHandler
{
  public boolean executeAction(VLAction paramVLAction, VVSActionHandlerListener paramVVSActionHandlerListener)
  {
    String str = VLActionUtil.getParamString(paramVLAction, "utterance.results", false);
    if (!StringUtils.isNullOrWhiteSpace(str))
      paramVVSActionHandlerListener.showUserText(str, this.turn);
    return false;
  }
}

/* Location:           C:\Users\nigeluno\Desktop\APK2Java\tools\classes-dex2jar.jar
 * Qualified Name:     com.vlingo.core.internal.dialogmanager.vvs.handlers.ShowUserTurnHandler
 * JD-Core Version:    0.6.0
 */