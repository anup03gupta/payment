/*
 * package com.zensar.broker.daoImpl;
 * 
 * 
 * import com.softwareag.entirex.aci.Broker;
 * 
 * import com.softwareag.entirex.aci.BrokerException;
 * 
 * import com.softwareag.entirex.aci.BrokerMessage;
 * 
 * import com.softwareag.entirex.aci.BrokerService;
 * 
 * import java.util.StringTokenizer;
 * 
 * public class BrokerCall
 * 
 * {
 * 
 * static String sClass = "INT";
 * 
 * static String sName = "BEBDEV";
 * 
 * static String sService = "INTERNET";
 * 
 * static String brokerID = "192.168.23.1:5085";
 * 
 * static String answer = "";
 * 
 * static String dil = "";
 * 
 * 
 * public static void main(String[] args) { String output = brokercall("CORE",
 * "PCB99CAV3 ");
 * 
 * System.out.println("FROM MAINFRAME " + output); }
 * 
 * 
 * 
 * 
 * 
 * 
 * public static String brokercall(String function, String data) {
 * 
 * System.out.println("In Call : " + function);
 * 
 * Broker broker = new Broker(brokerID, "ESSGTEST");
 * 
 * BrokerService bService = new BrokerService(broker, sClass, sName, sService);
 * 
 * bService.setMaxReceiveLen(10000);
 * 
 * BrokerMessage bRequest = new BrokerMessage();
 * 
 * try {
 * 
 * broker.logon();
 * 
 * System.out.println("Client started: " + broker.getBrokerID() +
 * broker.getConnInfo() + '\n' + '\n');
 * 
 * if (function.equals("DIL")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESADNZDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data);
 * 
 * String msg = "";
 * 
 * answer = "";
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * System.out.println(msg);
 * 
 * if (msg.substring(12, 13).equals("Y")) {
 * 
 * answer += msg.substring(13, 83).trim();
 * 
 * } else {
 * 
 * answer = msg.substring(93, msg.length()).trim();
 * 
 * }
 * 
 * }
 * 
 * if (function.equals("AUTH")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFPCBO01N2XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data);
 * 
 * String msg = "";
 * 
 * answer = "";
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * System.out.println(msg);
 * 
 * if (msg.substring(18, 19).equals("Y")) {
 * 
 * answer += msg.substring(20, 100).trim();
 * 
 * } else {
 * 
 * answer += msg.substring(101, msg.length()).trim();
 * 
 * }
 * 
 * System.out.println(answer);
 * 
 * }
 * 
 * if (function.equals("MONITOR")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESADN1XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data);
 * 
 * String msg = "";
 * 
 * answer = "";
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * System.out.println(msg.substring(42, 43));
 * 
 * if (msg.substring(42, 43).equals("Y")) {
 * 
 * answer += msg.substring(44, 124).trim();
 * 
 * } else {
 * 
 * answer += msg.substring(124, msg.length()).trim();
 * 
 * answer = formatData(answer);
 * 
 * }
 * 
 * }
 * 
 * if (function.equals("AUDIT")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESADN2XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data);
 * 
 * String msg = "";
 * 
 * answer = "";
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * if (msg.substring(42, 43).equals("Y")) {
 * 
 * answer += msg.substring(43, 123).trim();
 * 
 * } else {
 * 
 * answer += msg.substring(124, msg.length()).trim();
 * 
 * answer = formatData(answer);
 * 
 * }
 * 
 * }
 * 
 * if (function.equals("AUDITLIST")) {
 * 
 * String msg = "";
 * 
 * String restartinst = "";
 * 
 * answer = "";
 * 
 * String eof = "N";
 * 
 * while (eof.equals("N")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESADN4XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data + restartinst);
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * restartinst = msg.substring(10, 41);
 * 
 * eof = msg.substring(41, 42);
 * 
 * if (msg.substring(42, 43).equals("Y")) {
 * 
 * answer += msg.substring(43, 123).trim(); continue;
 * 
 * }
 * 
 * answer += msg.substring(124, msg.length()).trim();
 * 
 * }
 * 
 * answer = formatData(answer);
 * 
 * }
 * 
 * if (function.equals("OMLIST")) {
 * 
 * String msg = "";
 * 
 * String restartinst = "";
 * 
 * answer = "";
 * 
 * String eof = "N";
 * 
 * while (eof.equals("N")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESADN3XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data + restartinst);
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * restartinst = msg.substring(10, 41);
 * 
 * eof = msg.substring(41, 42);
 * 
 * if (msg.substring(42, 43).equals("Y")) {
 * 
 * answer += msg.substring(43, 123).trim(); continue;
 * 
 * }
 * 
 * answer += msg.substring(124, msg.length()).trim();
 * 
 * }
 * 
 * answer = formatData(answer);
 * 
 * System.out.println(answer);
 * 
 * }
 * 
 * if (function.equals("OMGETTO")) {
 * 
 * System.out.println("In OM TO Call");
 * 
 * String msg = "";
 * 
 * String restartinst = "";
 * 
 * answer = "";
 * 
 * String eof = "N";
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESADN6XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data + restartinst);
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * restartinst = msg.substring(10, 41);
 * 
 * eof = msg.substring(41, 42);
 * 
 * if (msg.substring(42, 43).equals("Y")) {
 * 
 * answer += msg.substring(43, 123).trim();
 * 
 * } else {
 * 
 * answer += msg.substring(124, msg.length()).trim();
 * 
 * }
 * 
 * answer = formatData(answer);
 * 
 * }
 * 
 * if (function.equals("OMGETTR")) {
 * 
 * System.out.println("In OM TR Call");
 * 
 * String msg = "";
 * 
 * String restartinst = "";
 * 
 * String restartseq = "0000000";
 * 
 * answer = "";
 * 
 * String eof = "N";
 * 
 * while (eof.equals("N")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESADN7XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data + restartseq);
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * restartinst = msg.substring(10, 41);
 * 
 * restartseq = msg.substring(41, 48);
 * 
 * eof = msg.substring(48, 49);
 * 
 * System.out.println(data + restartinst + restartseq + eof + msg.substring(49,
 * 50));
 * 
 * if (msg.substring(49, 50).equals("Y")) {
 * 
 * answer += msg.substring(50, 130).trim(); continue;
 * 
 * }
 * 
 * answer += msg.substring(131, msg.length()).trim();
 * 
 * }
 * 
 * answer = formatData(answer);
 * 
 * }
 * 
 * if (function.equals("CODES")) {
 * 
 * System.out.println("In Code List Call");
 * 
 * String msg = "";
 * 
 * String restarttype = "";
 * 
 * String restartcode = "";
 * 
 * answer = "";
 * 
 * String eof = "N";
 * 
 * while (eof.equals("N")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESADN0XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data + restarttype + restartcode);
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * restarttype = msg.substring(10, 13);
 * 
 * restartcode = msg.substring(13, 18);
 * 
 * eof = msg.substring(18, 19);
 * 
 * System.out.println(data + restarttype + restartcode + eof + msg.substring(19,
 * 20));
 * 
 * if (msg.substring(19, 20).equals("Y")) {
 * 
 * answer += msg.substring(20, 100).trim(); continue;
 * 
 * }
 * 
 * answer += msg.substring(101, msg.length()).trim();
 * 
 * }
 * 
 * answer = formatData(answer);
 * 
 * }
 * 
 * if (function.equals("FCODES")) {
 * 
 * System.out.println("In Finacle Code List Call");
 * 
 * String msg = "";
 * 
 * String restartcntr = "";
 * 
 * String restartcode = "";
 * 
 * answer = "";
 * 
 * String eof = "N";
 * 
 * while (eof.equals("N")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESADN9XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data + restartcntr + restartcode);
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * restartcntr = msg.substring(10, 12);
 * 
 * restartcode = msg.substring(12, 20);
 * 
 * eof = msg.substring(20, 21);
 * 
 * System.out.println(data + restartcntr + restartcode + eof + msg.substring(21,
 * 22));
 * 
 * if (msg.substring(21, 22).equals("Y")) {
 * 
 * answer += msg.substring(22, 102).trim(); continue;
 * 
 * }
 * 
 * answer += msg.substring(103, msg.length()).trim();
 * 
 * }
 * 
 * answer = formatData(answer);
 * 
 * }
 * 
 * if (function.equals("UCODES")) {
 * 
 * System.out.println("In Unpaid Code List Call");
 * 
 * String msg = "";
 * 
 * String restartcntr = "";
 * 
 * String restartcode = "";
 * 
 * answer = "";
 * 
 * String eof = "N";
 * 
 * while (eof.equals("N")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESAN10XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data + restartcntr + restartcode);
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * restartcntr = msg.substring(10, 12);
 * 
 * restartcode = msg.substring(12, 20);
 * 
 * eof = msg.substring(20, 21);
 * 
 * System.out.println(data + restartcntr + restartcode + eof + msg.substring(21,
 * 22));
 * 
 * if (msg.substring(21, 22).equals("Y")) {
 * 
 * answer += msg.substring(22, 102).trim(); continue;
 * 
 * }
 * 
 * answer += msg.substring(103, msg.length()).trim();
 * 
 * }
 * 
 * answer = formatData(answer);
 * 
 * }
 * 
 * if (function.equals("PUBLIC")) {
 * 
 * System.out.println("In Public Holidays List Call");
 * 
 * String msg = "";
 * 
 * String restartcntr = "";
 * 
 * String restartdate = "";
 * 
 * answer = "";
 * 
 * String eof = "N";
 * 
 * while (eof.equals("N")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESAN11XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data + restartdate + restartcntr);
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * restartdate = msg.substring(10, 18);
 * 
 * restartcntr = msg.substring(18, 20);
 * 
 * eof = msg.substring(20, 21);
 * 
 * System.out.println(data + restartcntr + restartdate + eof + msg.substring(21,
 * 22));
 * 
 * if (msg.substring(21, 22).equals("Y")) {
 * 
 * answer += msg.substring(22, 102).trim(); continue;
 * 
 * }
 * 
 * answer += msg.substring(103, msg.length()).trim();
 * 
 * }
 * 
 * answer = formatData(answer);
 * 
 * }
 * 
 * if (function.equals("BIC")) {
 * 
 * System.out.println("In BIC Codes List Call");
 * 
 * String msg = "";
 * 
 * String restartcntr = "";
 * 
 * String restartcurr = "";
 * 
 * answer = "";
 * 
 * String eof = "N";
 * 
 * while (eof.equals("N")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESAN12XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data + restartcntr + restartcurr);
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * restartcntr = msg.substring(10, 12);
 * 
 * restartcurr = msg.substring(12, 15);
 * 
 * eof = msg.substring(20, 21);
 * 
 * System.out.println(data + restartcntr + restartcurr + eof + msg.substring(21,
 * 22));
 * 
 * if (msg.substring(21, 22).equals("Y")) {
 * 
 * answer += msg.substring(15, 95).trim(); continue;
 * 
 * }
 * 
 * answer += msg.substring(96, msg.length()).trim();
 * 
 * }
 * 
 * answer = formatData(answer);
 * 
 * }
 * 
 * if (function.equals("PROC")) {
 * 
 * System.out.println("In Processing option List Call");
 * 
 * String msg = "";
 * 
 * String restartcntr = "";
 * 
 * String restartcurr = "";
 * 
 * String restartotype = "";
 * 
 * answer = "";
 * 
 * String eof = "N";
 * 
 * while (eof.equals("N")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESAN13XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data + restartcntr + restartcurr);
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * restartcntr = msg.substring(10, 12);
 * 
 * restartcurr = msg.substring(12, 15);
 * 
 * restartotype = msg.substring(15, 16);
 * 
 * eof = msg.substring(16, 17);
 * 
 * System.out.println(data + restartcntr + restartcurr + eof + msg.substring(17,
 * 18));
 * 
 * if (msg.substring(17, 18).equals("Y")) {
 * 
 * answer += msg.substring(18, 98).trim(); continue;
 * 
 * }
 * 
 * answer += msg.substring(99, msg.length()).trim();
 * 
 * }
 * 
 * answer = formatData(answer);
 * 
 * }
 * 
 * if (function.equals("UNPAID")) {
 * 
 * System.out.println("In Unmatch Unpaid Call");
 * 
 * String msg = "";
 * 
 * String restartinst = "";
 * 
 * String restartseq = "0000000";
 * 
 * answer = "";
 * 
 * String eof = "N";
 * 
 * while (eof.equals("N")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESADN8XDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data + restartinst + restartseq);
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * restartinst = msg.substring(10, 41);
 * 
 * restartseq = msg.substring(41, 48);
 * 
 * eof = msg.substring(48, 49);
 * 
 * System.out.println(data + restartinst + restartseq + eof + msg.substring(49,
 * 50));
 * 
 * if (msg.substring(49, 50).equals("Y")) {
 * 
 * answer += msg.substring(50, 130).trim(); continue;
 * 
 * }
 * 
 * answer += msg.substring(131, msg.length()).trim();
 * 
 * }
 * 
 * answer = formatData(answer);
 * 
 * }
 * 
 * if (function.equals("CORE")) {
 * 
 * System.out.println("In CORE list Call");
 * 
 * String msg = "";
 * 
 * String restartinst = "";
 * 
 * String restartseq = "0000000";
 * 
 * answer = "";
 * 
 * String eof = "N";
 * 
 * while (eof.equals("N")) {
 * 
 * bRequest.setMessage(
 * "PROCBUFFBPESADNAXDF02   AND15   010200000605ZATA123456789012345678901234567890123456789012345678901234567890123412345678901234567890"
 * + data + restartinst);
 * 
 * BrokerMessage bReply = bService.sendReceive(bRequest, "60S");
 * 
 * msg = bReply.toString();
 * 
 * restartinst = msg.substring(10, 41);
 * 
 * eof = msg.substring(41, 42);
 * 
 * System.out.println(data + restartinst + eof + msg.substring(49, 50));
 * 
 * if (msg.substring(42, 43).equals("Y")) {
 * 
 * answer += msg.substring(43, 123).trim(); continue;
 * 
 * }
 * 
 * answer += msg.substring(124, msg.length()).trim();
 * 
 * }
 * 
 * answer = formatData(answer);
 * 
 * }
 * 
 * broker.logoff();
 * 
 * } catch (BrokerException bE) {
 * 
 * System.out.println("Broker Server Exception: \n");
 * 
 * System.out.println("  Error Class = " + bE.getErrorClass() +
 * "\n  Error Code = " + bE.getErrorCode() + "\n  Error Message = " +
 * bE.getMessage() + '\n' + '\n');
 * 
 * }
 * 
 * return answer;
 * 
 * }
 * 
 * public static String formatData(String data) {
 * 
 * String data2 = data;
 * 
 * int i = 0;
 * 
 * String row = "";
 * 
 * String dil = brokercall("DIL", "PCB99BPES1");
 * 
 * StringTokenizer st = new StringTokenizer(data2, dil);
 * 
 * while (st.hasMoreElements()) {
 * 
 * String cells = st.nextToken().trim();
 * 
 * if (cells.equals("@")) {
 * 
 * i++;
 * 
 * row = row + '\r' + '\n'; continue;
 * 
 * }
 * 
 * row = row + cells + "~";
 * 
 * }
 * 
 * return row;
 * 
 * }
 * 
 * }
 * 
 */