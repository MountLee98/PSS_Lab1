package lab.pai.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Delegation {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int delegationId;
	private String description;
	@Column(nullable = false)
	private LocalDateTime dateTimeStart;
	@Column(nullable = false)
	private LocalDateTime dateTimeStop;
	@Column(columnDefinition = "integer default 30")
	private Integer travelDietAmount;
	@Column(columnDefinition = "integer default 0")
	private Integer breakfastNumber;
	@Column(columnDefinition = "integer default 0")
	private Integer dinnerNumber;
	@Column(columnDefinition = "integer default 0")
	private Integer supperNumber;
	private Transport transportType;
	private int ticketPrice;
	private AutoCapacity autoCapacityl;
	private int km;
	private int otherTicketsPrice;
	private String otherOutlayDesc;
	private int otherOutlayPrice;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
	
	public int getDelegationId() {
		return delegationId;
	}
	public void setDelegationId(int delegationId) {
		this.delegationId = delegationId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getDateTimeStart() {
		return dateTimeStart;
	}
	public void setDateTimeStart(LocalDateTime dateTimeStart) {
		this.dateTimeStart = dateTimeStart;
	}
	public LocalDateTime getDateTimeStop() {
		return dateTimeStop;
	}
	public void setDateTimeStop(LocalDateTime dateTimeStop) {
		this.dateTimeStop = dateTimeStop;
	}
	public Integer getTravelDietAmount() {
		return travelDietAmount;
	}
	public void setTravelDietAmount(Integer travelDietAmount) {
		this.travelDietAmount = travelDietAmount;
	}
	public Integer getBreakfastNumber() {
		return breakfastNumber;
	}
	public void setBreakfastNumber(Integer breakfastNumber) {
		this.breakfastNumber = breakfastNumber;
	}
	public Integer getDinnerNumber() {
		return dinnerNumber;
	}
	public void setDinnerNumber(Integer dinnerNumber) {
		this.dinnerNumber = dinnerNumber;
	}
	public Integer getSupperNumber() {
		return supperNumber;
	}
	public void setSupperNumber(Integer supperNumber) {
		this.supperNumber = supperNumber;
	}
	public Transport getTransportType() {
		return transportType;
	}
	public void setTransportType(Transport transportType) {
		this.transportType = transportType;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public AutoCapacity getAutoCapacityl() {
		return autoCapacityl;
	}
	public void setAutoCapacityl(AutoCapacity autoCapacityl) {
		this.autoCapacityl = autoCapacityl;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public int getOtherTicketsPrice() {
		return otherTicketsPrice;
	}
	public void setOtherTicketsPrice(int otherTicketsPrice) {
		this.otherTicketsPrice = otherTicketsPrice;
	}
	public String getOtherOutlayDesc() {
		return otherOutlayDesc;
	}
	public void setOtherOutlayDesc(String otherOutlayDesc) {
		this.otherOutlayDesc = otherOutlayDesc;
	}
	public int getOtherOutlayPrice() {
		return otherOutlayPrice;
	}
	public void setOtherOutlayPrice(int otherOutlayPrice) {
		this.otherOutlayPrice = otherOutlayPrice;
	}
	
	
}
