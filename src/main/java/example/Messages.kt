package example

import com.github.rinde.rinsim.core.model.comm.MessageContents

class CallForProposal(val order: Order) : MessageContents

class Propose(val bid: Bid) : MessageContents
//TODO implement Refuse
class Refuse(val order: Order) : MessageContents

//TODO implement RejectProposal
class RejectProposal(val bid: Bid) : MessageContents
class AcceptProposal(val bid: Bid) : MessageContents

class Agree(val bid: Bid) : MessageContents
class Disagree(val bid: Bid) : MessageContents

class GotBetterOffer(val orderThatIsLost: Order) : MessageContents

class Failure() : MessageContents
