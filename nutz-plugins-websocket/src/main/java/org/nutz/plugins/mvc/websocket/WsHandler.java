package org.nutz.plugins.mvc.websocket;

import javax.servlet.http.HttpSession;
import javax.websocket.MessageHandler;
import javax.websocket.Session;

public interface WsHandler extends MessageHandler {
    
    void setSession(Session session);
    
    void setHttpSession(HttpSession httpSession);
    
    void setRoomProvider(WsRoomProvider roomProvider);
    
    void onMessage(String msg);
    
    void depose();
}
