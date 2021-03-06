package com.vlingo.core.internal.dialogmanager.vvs.handlers.clientdriven;

import com.vlingo.core.internal.dialogmanager.controllers.CheckScheduleController;
import com.vlingo.core.internal.dialogmanager.vvs.VVSActionHandler;
import com.vlingo.core.internal.dialogmanager.vvs.VVSActionHandlerListener;
import com.vlingo.sdk.recognition.VLAction;

public class CheckScheduleHandler extends VVSActionHandler
{
  public boolean executeAction(VLAction paramVLAction, VVSActionHandlerListener paramVVSActionHandlerListener)
  {
    return ((CheckScheduleController)getController(CheckScheduleController.class)).executeAction(paramVLAction, paramVVSActionHandlerListener);
  }
}

/* Location:           C:\Users\nigeluno\Desktop\APK2Java\tools\classes-dex2jar.jar
 * Qualified Name:     com.vlingo.core.internal.dialogmanager.vvs.handlers.clientdriven.CheckScheduleHandler
 * JD-Core Version:    0.6.0
 */