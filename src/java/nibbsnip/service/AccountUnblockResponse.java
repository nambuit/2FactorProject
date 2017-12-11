/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nibbsnip.service;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author chijiokennamani
 */
@Getter @Setter 
public class AccountUnblockResponse {
    private String SessionID;
    private String DestinationInstitutionCode;
    private Integer ChannelCode;
    private String ReferenceCode;
    private String TargetAccountName;
    private String TargetBankVerificationNumber;
    private String TargetAccountNumber;
    private String ReasonCode;
    private String Narration;
    private String ResponseCode; 
}
