  interface Notification{
	 void notifyUser();
	}
  class EmailNotification implements Notification{
	  public void notifyUser() {
		System.out.println("sending an email notification");  
	  }
  }
  class MessageNotification implements Notification{
	  public void notifyUser() {
		  System.out.println("sending an Message notification");
		  
	  }
  }
  class PushNotification implements Notification{
	  public void notifyUser() {
		  System.out.println("sending an push notification");
	  }
	  }
  class NotificationFactory {
	    public Notification createNotification(String channel)
	    {
	        if (channel == null || channel.isEmpty())
	            return null;
	        if ("Message".equals(channel)) {
	            return new MessageNotification();
	        }
	        else if ("EMAIL".equals(channel)) {
	            return new EmailNotification();
	        }
	        else if ("PUSH".equals(channel)) {
	            return new PushNotification();
	        }
	        return null;
	    }
	}
  
public class FactoryDesign {

	public static void main(String[] args) {
		{
	        NotificationFactory notificationFactory = new NotificationFactory();
	        Notification notification = notificationFactory.createNotification("Message");
	        notification.notifyUser();
	    }
	}

	}


