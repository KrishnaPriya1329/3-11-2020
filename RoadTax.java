class RoadTax
{
	public static void main(String args[])
	{
		int vehicleprice=100000;
		String stateKeyword="AP";
		Switch(stateKeyword);
		{
			case  "AP" : float gst=vehicleprice*0.12f;
				  float roadtax=vehicleprice+gst;
				  System.out.println("The price of roadtax is:", +roadtax);
				  break;
			case  "KA" : float gst=vehicleprice*0.18f;
				  float roadtax=vehicleprice+gst;
				  System.out.println("The price of roadtax is:", +roadtax);
				  break;
			case  "TG" : float gst=vehicleprice*0.13f;
				  float roadtax=vehicleprice+gst;
				  System.out.println("The price of roadtax is:", +roadtax);
				  break;
			case  "TN" : float gst=vehicleprice*0.18f;
				  float roadtax=vehicleprice+gst;
				  System.out.println("The price of roadtax is:", +roadtax);
				  break;
			case  "KE" : float gst=vehicleprice*0.15f;
				  float roadtax=vehicleprice+gst;
				  System.out.println("The price of roadtax is:", +roadtax);
				  break;
			case  "RJ" : float gst=vehicleprice*0.19f;
				  float roadtax=vehicleprice+gst;
				  System.out.println("The price of roadtax is:", +roadtax);
				  break;
			default : System.out.println("StateKeyword not Found");
				break;
		}
	}
}