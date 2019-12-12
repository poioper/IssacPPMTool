import React, { Component } from "react";
import Projectitem from "./Project/Projectitem";
import Header from "./Layout/Header";

class Dashboard extends Component {
  render() {
    return (
      <div>
        <Header />
        <h1>Welcome to the Dashboard</h1>
        <Projectitem />
      </div>
    );
  }
}

export default Dashboard;
